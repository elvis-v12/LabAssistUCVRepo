package SoftwareAsistencia.Controllers;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Point;
import org.opencv.imgproc.Imgproc;  // Importación para Imgproc
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.DataBufferByte;

public class ReconocerRostro {

    private VideoCapture capture;
    private JFrame frame;
    private JPanel panel;
    private JButton startButton;
    private Mat frameMat;
    private CascadeClassifier faceCascade;
    private boolean isRunning;
    private JLabel imageLabel; // Mover la declaración aquí

    public ReconocerRostro() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        capture = new VideoCapture(0);

        if (!capture.isOpened()) {
            System.out.println("Error al inicializar la cámara.");
            return;
        }

        frame = new JFrame("Detección de Rostros");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.setContentPane(panel);

        startButton = new JButton("Iniciar Detección");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startDetection();
            }
        });
        panel.add(startButton);

        // Añadir un JLabel para mostrar la imagen
        imageLabel = new JLabel(); // Inicializar la variable aquí
        panel.add(imageLabel);

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
                stopDetection();
                frame.dispose();
            }
        });

        isRunning = false;
    }

    public void stopDetection() {
        isRunning = false;
        capture.release();
    }

    public void startDetection() {
        if (!isRunning) {
            isRunning = true;
            capture.open(0);

            if (!capture.isOpened()) {
                System.out.println("Error al inicializar la cámara.");
                return;
            }

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (isRunning) {
                        if (capture.read(frameMat)) {
                            if (frameMat.channels() > 1) {
                                Imgproc.cvtColor(frameMat, frameMat, Imgproc.COLOR_BGR2GRAY);
                            }

                            Imgproc.equalizeHist(frameMat, frameMat);

                            MatOfRect faceDetections = new MatOfRect();
                            faceCascade.detectMultiScale(frameMat, faceDetections);

                            for (Rect rect : faceDetections.toArray()) {
                                Imgproc.rectangle(frameMat, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                                        new Scalar(0, 255, 0), 2);
                            }

                            ImageIcon imageIcon = new ImageIcon(matToBufferedImage(frameMat));
                            imageLabel.setIcon(imageIcon);
                            frame.repaint();
                        }

                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
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
       javax.swing.SwingUtilities.invokeLater(() -> new ReconocerRostro());
   }
}

            