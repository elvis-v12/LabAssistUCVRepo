package SoftwareAsistencia.Controllers;

import SoftwareAsistencia.model.dao.AlumnoDAOImpl;
import SoftwareAsistencia.model.interfaz.AlumnoDAO;
import SofwareRegistroAsistencia.view.Lista.Prueba;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.sql.SQLException;

public class FaceRecognition {

    private VideoCapture capture;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton startButton;
    private JButton stopButton;
    private Mat frameMat;
    private CascadeClassifier faceCascade;
    private boolean isRunning;
    private AlumnoDAO alumnoDAO;
    private String alumnoCodigo; 

    private static final String CARPETA_GUARDADO = "C:\\Users\\Elvis\\Documents\\NetBeansProjects\\SofwareMatricula\\Rostros";

    public FaceRecognition(String alumnoCodigo) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        this.alumnoCodigo = alumnoCodigo;
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
        alumnoDAO = new AlumnoDAOImpl();
    }

private void reconocerRostro() {
    if (seDetectoRostro()) {
        JOptionPane.showMessageDialog(frame, "Rostro reconocido.", "Información", JOptionPane.INFORMATION_MESSAGE);
        Prueba pruebaForm = new Prueba();
        pruebaForm.setVisible(true);
        frame.dispose(); 
    } else {
        JOptionPane.showMessageDialog(frame, "No se detectó ningún rostro.", "Error", JOptionPane.WARNING_MESSAGE);
    }
}


    private boolean seDetectoRostro() {
        MatOfRect faceDetections = new MatOfRect();
        faceCascade.detectMultiScale(frameMat, faceDetections);
        return faceDetections.toArray().length > 0;
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
            String filename = CARPETA_GUARDADO + "\\cara_" + alumnoCodigo + ".jpg";

            File carpetaGuardado = new File(CARPETA_GUARDADO);
            if (!carpetaGuardado.exists()) {
                carpetaGuardado.mkdirs();
            }

            Imgcodecs.imwrite(filename, faceROI);
            System.out.println("Cara temporal guardada en: " + filename);

            try {
                alumnoDAO.guardarImagen(alumnoCodigo, filename);
                System.out.println("Imagen guardada en la base de datos.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        ImageIcon image = new ImageIcon(matToBufferedImage(frameMat));
        label.setIcon(image);
        frame.repaint();
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
    SwingUtilities.invokeLater(() -> {
        String input = JOptionPane.showInputDialog(null, "Ingrese el ID del estudiante:", "ID del Estudiante", JOptionPane.QUESTION_MESSAGE);
        if (input != null && !input.trim().isEmpty()) {
            new FaceRecognition(input);
        } else {
            JOptionPane.showMessageDialog(null, "ID del estudiante no válido. Por favor, ingrese un valor.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    });
}

}
