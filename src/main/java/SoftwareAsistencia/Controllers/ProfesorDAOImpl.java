package SoftwareAsistencia.Controllers;
import SoftwareAsistencia.model.Profesor;
import SoftwareAsistencia.model.interfaz.ProfesorDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfesorDAOImpl implements ProfesorDAO {
    private Connection connection;

    public ProfesorDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Profesor getProfesorById(int id) {
        String query = "SELECT * FROM Profesor WHERE Profesor_Codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Profesor(
                    rs.getInt("Profesor_Codigo"),
                    rs.getString("Profesor_Nombres"),
                    rs.getString("Profesor_Apellidos"),
                    rs.getString("Profesor_Email"),
                    rs.getString("Profesor_Especialidad"),
                    rs.getString("Profesor_Telefono")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Profesor> getAllProfesores() {
        List<Profesor> profesores = new ArrayList<>();
        String query = "SELECT * FROM Profesor";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                profesores.add(new Profesor(
                    rs.getInt("Profesor_Codigo"),
                    rs.getString("Profesor_Nombres"),
                    rs.getString("Profesor_Apellidos"),
                    rs.getString("Profesor_Email"),
                    rs.getString("Profesor_Especialidad"),
                    rs.getString("Profesor_Telefono")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profesores;
    }

    @Override
    public void addProfesor(Profesor profesor) {
        String query = "INSERT INTO Profesor (Profesor_Nombres, Profesor_Apellidos, Profesor_Email, Profesor_Especialidad, Profesor_Telefono) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, profesor.getProfesorNombres());
            stmt.setString(2, profesor.getProfesorApellidos());
            stmt.setString(3, profesor.getProfesorEmail());
            stmt.setString(4, profesor.getProfesorEspecialidad());
            stmt.setString(5, profesor.getProfesorTelefono());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateProfesor(Profesor profesor) {
        String query = "UPDATE Profesor SET Profesor_Nombres = ?, Profesor_Apellidos = ?, Profesor_Email = ?, Profesor_Especialidad = ?, Profesor_Telefono = ? WHERE Profesor_Codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, profesor.getProfesorNombres());
            stmt.setString(2, profesor.getProfesorApellidos());
            stmt.setString(3, profesor.getProfesorEmail());
            stmt.setString(4, profesor.getProfesorEspecialidad());
            stmt.setString(5, profesor.getProfesorTelefono());
            stmt.setInt(6, profesor.getProfesorCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProfesor(int id) {
        String query = "DELETE FROM Profesor WHERE Profesor_Codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
