package SoftwareAsistencia.methods;



import org.opencv.core.*;
import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.File;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

public class FaceRecognition {

    private final VideoCapture capture;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton startButton;
    private JButton stopButton;
    private Mat frameMat;
    private CascadeClassifier faceCascade;
    private boolean isRunning;
    private Connection connection;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/registrosalumnos";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";
    private static final String CARPETA_GUARDADO = "C:\\Users\\Elvis\\Documents\\NetBeansProjects\\SofwareMatricula\\Rostros";
    private static final String CARPETA_REFERENCIAS = "C:\\Users\\Elvis\\Documents\\NetBeansProjects\\SofwareMatricula\\Rostros";

    public FaceRecognition() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        capture = new VideoCapture(0);

        if (!capture.isOpened()) {
            System.out.println("Error al inicializar la cámara.");
            return;
        }

        frame = new JFrame("Reconocimiento Facial");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.setContentPane(panel);

        label = new JLabel();
        panel.add(label);

        startButton = new JButton("Iniciar");
        startButton.addActionListener(e -> startCapture());
        panel.add(startButton);

        stopButton = new JButton("Detener");
        stopButton.addActionListener(e -> stopCapture());
        panel.add(stopButton);

        JButton recognizeButton = new JButton("Reconocer Rostro");
        recognizeButton.addActionListener(e -> reconocerRostro());
        panel.add(recognizeButton);

        frame.setVisible(true);

        frameMat = new Mat();

        faceCascade = new CascadeClassifier();
        faceCascade.load("haarcascade_frontalface_default.xml");

        if (faceCascade.empty()) {
            System.out.println("Error al cargar el clasificador facial.");
            return;
        }

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                stopCapture();
                frame.dispose();
            }
        });

        isRunning = false; // No iniciar la captura automáticamente al inicio
    }

    private void reconocerRostro() {
        if (seDetectoRostro()) {
            abrirNuevoFormulario();
        } else {
            JOptionPane.showMessageDialog(frame, "No se detectó ningún rostro.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean seDetectoRostro() {
        MatOfRect faceDetections = new MatOfRect();
        faceCascade.detectMultiScale(frameMat, faceDetections);
        return faceDetections.toArray().length > 0;
    }

    private void abrirNuevoFormulario() {
        SwingUtilities.invokeLater(() -> {
            //prueva pruebaFormulario = new prueva();
           // pruebaFormulario.setVisible(true);
        });
    }

    private boolean compararConReferencias(String imagenCapturada) {
        try {
            File carpetaReferencias = new File(CARPETA_REFERENCIAS);
            File[] archivosReferencia = carpetaReferencias.listFiles();

            for (File archivoReferencia : archivosReferencia) {
                String imagenReferencia = archivoReferencia.getAbsolutePath();
                if (realizarComparacion(imagenCapturada, imagenReferencia)) {
                    return true;  // Coincidencia encontrada
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;  // No se encontraron coincidencias
    }

    public static boolean realizarComparacion(String imagenCapturada, String imagenReferencia) {
        return imagenCapturada.equals(imagenReferencia);
    }

    public void stopCapture() {
        isRunning = false;
        capture.release();
    }

    public void startCapture() {
        if (!isRunning) {
            isRunning = true;
            startButton.setEnabled(false);
            capture.open(0);

            if (!capture.isOpened()) {
                System.out.println("Error al inicializar la cámara.");
                return;
            }

            new Thread(() -> {
                while (isRunning) {
                    if (capture.read(frameMat)) {
                        processFrame();
                    }

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    private void processFrame() {
        if (frameMat.channels() > 1) {
            Imgproc.cvtColor(frameMat, frameMat, Imgproc.COLOR_BGR2GRAY);
        }

        Imgproc.equalizeHist(frameMat, frameMat);

        MatOfRect faceDetections = new MatOfRect();
        faceCascade.detectMultiScale(frameMat, faceDetections);

        for (Rect rect : faceDetections.toArray()) {
            Mat faceROI = new Mat(frameMat, rect);
            String filename = CARPETA_GUARDADO + "\\cara_temp.jpg";

            File carpetaGuardado = new File(CARPETA_GUARDADO);
            if (!carpetaGuardado.exists()) {
                carpetaGuardado.mkdirs();
            }

            Imgcodecs.imwrite(filename, faceROI);
            System.out.println("Cara temporal guardada en: " + filename);

            if (compararConReferencias(filename)) {
                saveImageToDatabase(filename);
            }
        }

        ImageIcon image = new ImageIcon(matToBufferedImage(frameMat));
        label.setIcon(image);
        frame.repaint();
    }

    private void saveImageToDatabase(String filename) {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            }

            String sql = "INSERT INTO images (filename) VALUES (?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, filename);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private BufferedImage matToBufferedImage(Mat mat) {
        int type = BufferedImage.TYPE_BYTE_GRAY;
        if (mat.channels() > 1) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        int bufferSize = mat.channels() * mat.cols() * mat.rows();
        byte[] bytes = new byte[bufferSize];
        mat.get(0, 0, bytes);
        BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(bytes, 0, targetPixels, 0, bytes.length);
        return image;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FaceRecognition::new);
    }
}
