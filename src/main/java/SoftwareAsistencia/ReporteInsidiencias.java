package SoftwareAsistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;

public class ReporteInsidiencias extends JFrame {
    private static String emailFrom = "elvisvegaucv@gmail.com";
    private static String passwordFrom = "htvurvmweppgkayz";
    private String emailTo;
    private String subject;
    private String content;
    private File fileAttachment;

    private Properties mProperties;
    private Session mSession;
    private MimeMessage mCorreo;

    private JTextField txtCorreo, txtAsunto, txtMensaje;
    private JButton btnSend, btnAttach;

    public ReporteInsidiencias() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        txtCorreo = new JTextField(20);
        txtAsunto = new JTextField(20);
        txtMensaje = new JTextField(20);
        btnSend = new JButton("Enviar");
        btnAttach = new JButton("Adjuntar Imagen");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Correo:"));
        panel.add(txtCorreo);
        panel.add(new JLabel("Asunto:"));
        panel.add(txtAsunto);
        panel.add(new JLabel("Mensaje:"));
        panel.add(txtMensaje);
        panel.add(btnAttach);
        panel.add(btnSend);
        this.add(panel);

        btnAttach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attachFile();
            }
        });

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createEmail();
                sendEmail();
            }
        });

        pack();
    }

    private void attachFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            fileAttachment = fileChooser.getSelectedFile();
        }
    }

    private void createEmail() {
        emailTo = txtCorreo.getText().trim();
        subject = txtAsunto.getText().trim();
        content = txtMensaje.getText().trim();

        // Simple mail transfer protocol
        mProperties = new Properties();
        mProperties.put("mail.smtp.host", "smtp.gmail.com");
        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mProperties.setProperty("mail.smtp.starttls.enable", "true");
        mProperties.setProperty("mail.smtp.port", "587");
        mProperties.setProperty("mail.smtp.user", emailFrom);
        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        mProperties.setProperty("mail.smtp.auth", "true");

        mSession = Session.getDefaultInstance(mProperties);

        try {
            mCorreo = new MimeMessage(mSession);
            mCorreo.setFrom(new InternetAddress(emailFrom));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mCorreo.setSubject(subject);

            // Create the message part
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(content, "ISO-8859-1", "html");

            // Create a multipart message for attachment
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Attachment part
            if (fileAttachment != null) {
                MimeBodyPart attachmentPart = new MimeBodyPart();
                DataSource source = new FileDataSource(fileAttachment);
                attachmentPart.setDataHandler(new DataHandler(source));
                attachmentPart.setFileName(fileAttachment.getName());
                multipart.addBodyPart(attachmentPart);
            }

            // Send the complete message parts
            mCorreo.setContent(multipart);

        } catch (MessagingException ex) {
            Logger.getLogger(ReporteInsidiencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendEmail() {
        try {
            Transport mTransport = mSession.getTransport("smtp");
            mTransport.connect(emailFrom, passwordFrom);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();

            JOptionPane.showMessageDialog(null, "Correo enviado");
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(ReporteInsidiencias.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(ReporteInsidiencias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new ReporteInsidiencias().setVisible(true);
    }
}
