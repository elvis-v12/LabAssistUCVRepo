package SoftwareAsistencia.Controllers;
import SoftwareAsistencia.model.Asistencia;
import SoftwareAsistencia.model.interfaz.AsistenciaDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AsistenciaDAOImpl implements AsistenciaDAO {
    private Connection connection;

    public AsistenciaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Asistencia getAsistenciaById(int id) {
        String query = "SELECT * FROM Asistencia WHERE Asistencia_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Asistencia(
                    rs.getInt("Asistencia_ID"),
                    rs.getInt("Asistencia_Alumno_ID"),
                    rs.getInt("Asistencia_Horario_ID"),
                    rs.getDate("Asistencia_Fecha_Hora"),
                    rs.getFloat("Asistencia_Porcentaje"),
                    rs.getString("Asistencia_Estado")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Asistencia> getAllAsistencias() {
        List<Asistencia> asistencias = new ArrayList<>();
        String query = "SELECT * FROM Asistencia";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                asistencias.add(new Asistencia(
                    rs.getInt("Asistencia_ID"),
                    rs.getInt("Asistencia_Alumno_ID"),
                    rs.getInt("Asistencia_Horario_ID"),
                    rs.getDate("Asistencia_Fecha_Hora"),
                    rs.getFloat("Asistencia_Porcentaje"),
                    rs.getString("Asistencia_Estado")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return asistencias;
    }

    @Override
    public void addAsistencia(Asistencia asistencia) {
        String query = "INSERT INTO Asistencia (Asistencia_Alumno_ID, Asistencia_Horario_ID, Asistencia_Fecha_Hora, Asistencia_Porcentaje, Asistencia_Estado) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, asistencia.getAsistenciaAlumnoID());
            stmt.setInt(2, asistencia.getAsistenciaHorarioID());
            stmt.setTimestamp(3, new Timestamp(asistencia.getAsistenciaFechaHora().getTime()));
            stmt.setFloat(4, asistencia.getAsistenciaPorcentaje());
            stmt.setString(5, asistencia.getAsistenciaEstado());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateAsistencia(Asistencia asistencia) {
        String query = "UPDATE Asistencia SET Asistencia_Alumno_ID = ?, Asistencia_Horario_ID = ?, Asistencia_Fecha_Hora = ?, Asistencia_Porcentaje = ?, Asistencia_Estado = ? WHERE Asistencia_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, asistencia.getAsistenciaAlumnoID());
            stmt.setInt(2, asistencia.getAsistenciaHorarioID());
            stmt.setTimestamp(3, new Timestamp(asistencia.getAsistenciaFechaHora().getTime()));
            stmt.setFloat(4, asistencia.getAsistenciaPorcentaje());
            stmt.setString(5, asistencia.getAsistenciaEstado());
            stmt.setInt(6, asistencia.getAsistenciaID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAsistencia(int id) {
        String query = "DELETE FROM Asistencia WHERE Asistencia_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
