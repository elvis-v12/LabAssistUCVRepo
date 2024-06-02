package com.mycompany.mensajeria_sin_api;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Mensajeria_Sin_API {

    public static void main(String[] args) {
        final String user = "ytorresastorga@gmail.com"; //Correo Remitente
        final String password = "xxxxxxxxx";
        final String destinatario = "yehinnerdavidtorresastorga@gmail.com";

        System.out.println("ENVIO DE EMAIL");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //Usuario SMTP
        props.put("mail.smtp.port", "587"); //Puerto TLS
        props.put("mail.smtp.auth", "true"); //Permiso de Autenticación
        props.put("mail.smtp.starttls.enable", "true"); //Permiso de Capa de Transporte (STARTTLS)
        
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("ytorresas@ucvvirtual.edu.pe", "kkie bexs wiql tijt");
                                                                                                           //Clave de Aplicacion de Tercero
                                                                                                           //Configuración del GMAIL
            }
        });

        try{
            MimeMessage mnsj = new MimeMessage(session);
            mnsj.addRecipient(Message.RecipientType.TO, new InternetAddress("ytorresastorga@gmail.com", true));
            mnsj.setSubject("Declaracion");
            mnsj.setText("TeAmoM");
            
            System.out.println("Cargando...");
            Transport.send(mnsj);
            System.out.println("Mensaje enviado correctamente");

        }catch (MessagingException e){
            JOptionPane.showMessageDialog(null, "Error en: "+e);
        }
    }
}