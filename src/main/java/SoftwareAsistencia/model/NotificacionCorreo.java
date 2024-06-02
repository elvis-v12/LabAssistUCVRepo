package SoftwareAsistencia.model;

import java.sql.Date;

public class NotificacionCorreo {
    private int notificacionID;
    private String destinatario;
    private String asunto;
    private String mensaje;
    private Date fechaEnvio;
    private int asistenciaID;

    public NotificacionCorreo(int notificacionID, String destinatario, String asunto, String mensaje, Date fechaEnvio) {
        this.notificacionID = notificacionID;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
       
    }

    public int getNotificacionID() {
        return notificacionID;
    }

    public void setNotificacionID(int notificacionID) {
        this.notificacionID = notificacionID;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getAsistenciaID() {
        return asistenciaID;
    }

    public void setAsistenciaID(int asistenciaID) {
        this.asistenciaID = asistenciaID;
    }

    
}