package SoftwareAsistencia.Controllers;
import SoftwareAsistencia.model.NotificacionCorreo;
import SoftwareAsistencia.model.interfaz.NotificacionCorreoDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NotificacionCorreoDAOImpl implements NotificacionCorreoDAO {
    private Connection connection;

    public NotificacionCorreoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public NotificacionCorreo getNotificacionById(int id) {
        String query = "SELECT * FROM Notificacion_Correo WHERE Notificacion_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new NotificacionCorreo(
                    rs.getInt("Notificacion_ID"),
                    rs.getString("Correo_Electronico"),
                    rs.getString("Asunto"),
                    rs.getString("Cuerpo"),
                    rs.getDate("Fecha_Envio")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<NotificacionCorreo> getAllNotificaciones() {
        List<NotificacionCorreo> notificaciones = new ArrayList<>();
        String query = "SELECT * FROM Notificacion_Correo";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                notificaciones.add(new NotificacionCorreo(
                    rs.getInt("Notificacion_ID"),
                    rs.getString("Correo_Electronico"),
                    rs.getString("Asunto"),
                    rs.getString("Cuerpo"),
                    rs.getDate("Fecha_Envio")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return notificaciones;
    }

    @Override
    public void addNotificacion(NotificacionCorreo notificacion) {
        String query = "INSERT INTO Notificacion_Correo (Correo_Electronico, Asunto, Cuerpo, Fecha_Envio) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, notificacion.getDestinatario());
            stmt.setString(2, notificacion.getAsunto());
            stmt.setString(3, notificacion.getMensaje());
            stmt.setTimestamp(4, new Timestamp(notificacion.getFechaEnvio().getTime()));
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateNotificacion(NotificacionCorreo notificacion) {
        String query = "UPDATE Notificacion_Correo SET Correo_Electronico = ?, Asunto = ?, Cuerpo = ?, Fecha_Envio = ? WHERE Notificacion_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, notificacion.getDestinatario());
            stmt.setString(2, notificacion.getAsunto());
            stmt.setString(3, notificacion.getAsunto());
            stmt.setTimestamp(4, new Timestamp(notificacion.getFechaEnvio().getTime()));
            stmt.setInt(5, notificacion.getNotificacionID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteNotificacion(int id) {
        String query = "DELETE FROM Notificacion_Correo WHERE Notificacion_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
