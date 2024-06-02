package SoftwareAsistencia.Controllers;
import SoftwareAsistencia.model.ObservacionesLaboratorio;
import SoftwareAsistencia.model.interfaz.ObservacionesLaboratorioDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ObservacionesLaboratorioDAOImpl implements ObservacionesLaboratorioDAO {
    private Connection connection;

    public ObservacionesLaboratorioDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ObservacionesLaboratorio getObservacionById(int id) {
        String query = "SELECT * FROM Observaciones_Laboratorio WHERE Observacion_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new ObservacionesLaboratorio(
                    rs.getInt("Observacion_ID"),
                    rs.getInt("Horario_ID"),
                    rs.getDate("Fecha_Observacion"),
                    rs.getString("Observacion")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ObservacionesLaboratorio> getAllObservaciones() {
        List<ObservacionesLaboratorio> observaciones = new ArrayList<>();
        String query = "SELECT * FROM Observaciones_Laboratorio";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                observaciones.add(new ObservacionesLaboratorio(
                    rs.getInt("Observacion_ID"),
                    rs.getInt("Horario_ID"),
                    rs.getDate("Fecha_Observacion"),
                    rs.getString("Observacion")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return observaciones;
    }

    @Override
    public void addObservacion(ObservacionesLaboratorio observacion) {
        String query = "INSERT INTO Observaciones_Laboratorio (Horario_ID, Fecha_Observacion, Observacion) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, observacion.getHorarioID());
            stmt.setTimestamp(2, new Timestamp(observacion.getFechaObservacion().getTime()));
            stmt.setString(3, observacion.getObservacion());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateObservacion(ObservacionesLaboratorio observacion) {
        String query = "UPDATE Observaciones_Laboratorio SET Horario_ID = ?, Fecha_Observacion = ?, Observacion = ? WHERE Observacion_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, observacion.getHorarioID());
            stmt.setTimestamp(2, new Timestamp(observacion.getFechaObservacion().getTime()));
            stmt.setString(3, observacion.getObservacion());
            stmt.setInt(4, observacion.getObservacionID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteObservacion(int id) {
        String query = "DELETE FROM Observaciones_Laboratorio WHERE Observacion_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
