package SoftwareAsistencia.model.interfaz;


import java.sql.SQLException;
import java.util.List;

public interface NotificacionCorreoDAO {
    void insertarNotificacion(String destinatario, String asunto, String mensaje, int asistenciaID) throws SQLException;
    List<Integer> obtenerTodosLosIdsDeAsistencia() throws SQLException;
}
