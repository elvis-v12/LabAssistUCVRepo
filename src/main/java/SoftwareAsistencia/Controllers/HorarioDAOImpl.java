package SoftwareAsistencia.Controllers;
import SoftwareAsistencia.model.Horario;
import SoftwareAsistencia.model.interfaz.HorarioDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HorarioDAOImpl implements HorarioDAO {
    private Connection connection;

    public HorarioDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Horario getHorarioById(int id) {
        String query = "SELECT * FROM Horario WHERE Horario_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Horario(
                    rs.getInt("Horario_ID"),
                    rs.getInt("Horario_Curso_ID"),
                    rs.getInt("Horario_Laboratorio_ID"),
                    rs.getString("Horario_Dia_Semana"),
                    rs.getDate("Horario_Hora_Inicio"),
                    rs.getDate("Horario_Hora_Fin")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Horario> getAllHorarios() {
        List<Horario> horarios = new ArrayList<>();
        String query = "SELECT * FROM Horario";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                horarios.add(new Horario(
                    rs.getInt("Horario_ID"),
                    rs.getInt("Horario_Curso_ID"),
                    rs.getInt("Horario_Laboratorio_ID"),
                    rs.getString("Horario_Dia_Semana"),
                    rs.getDate("Horario_Hora_Inicio"),
                    rs.getDate("Horario_Hora_Fin")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return horarios;
    }

    @Override
    public void addHorario(Horario horario) {
        String query = "INSERT INTO Horario (Horario_Curso_ID, Horario_Laboratorio_ID, Horario_Dia_Semana, Horario_Hora_Inicio, Horario_Hora_Fin) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, horario.getHorarioCursoID());
            stmt.setInt(2, horario.getHorarioLaboratorioID());
            stmt.setString(3, horario.getHorarioDiaSemana());
            stmt.setTimestamp(4, new Timestamp(horario.getHorarioHoraInicio().getTime()));
            stmt.setTimestamp(5, new Timestamp(horario.getHorarioHoraFin().getTime()));
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateHorario(Horario horario) {
        String query = "UPDATE Horario SET Horario_Curso_ID = ?, Horario_Laboratorio_ID = ?, Horario_Dia_Semana = ?, Horario_Hora_Inicio = ?, Horario_Hora_Fin = ? WHERE Horario_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, horario.getHorarioCursoID());
            stmt.setInt(2, horario.getHorarioLaboratorioID());
            stmt.setString(3, horario.getHorarioDiaSemana());
            stmt.setTimestamp(4, new Timestamp(horario.getHorarioHoraInicio().getTime()));
            stmt.setTimestamp(5, new Timestamp(horario.getHorarioHoraFin().getTime()));
            stmt.setInt(6, horario.getHorarioID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteHorario(int id) {
        String query = "DELETE FROM Horario WHERE Horario_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
