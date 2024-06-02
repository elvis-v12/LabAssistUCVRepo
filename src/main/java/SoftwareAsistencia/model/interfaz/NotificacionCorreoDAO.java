package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.NotificacionCorreo;
import java.util.List;

public interface NotificacionCorreoDAO {
    NotificacionCorreo getNotificacionById(int id);
    List<NotificacionCorreo> getAllNotificaciones();
    void addNotificacion(NotificacionCorreo notificacion);
    void updateNotificacion(NotificacionCorreo notificacion);
    void deleteNotificacion(int id);
}
