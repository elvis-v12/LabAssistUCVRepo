package SoftwareAsistencia.Controllers;
import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.interfaz.AlumnoDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAOImpl implements AlumnoDAO {
    private Connection connection;

    public AlumnoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Alumno getAlumnoById(int id) {
        String query = "SELECT * FROM Alumno WHERE Alumno_Codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Alumno(
                    rs.getInt("Alumno_Codigo"),
                    rs.getString("Alumno_Nombres"),
                    rs.getString("Alumno_Apellidos"),
                    rs.getString("Alumno_Email"),
                    rs.getString("Alumno_QR"),
                    rs.getString("Alumno_Imagen_Rostro"),
                    rs.getString("Alumno_Carrera_Profesional"),
                    rs.getString("Alumno_Estado")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Alumno> getAllAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        String query = "SELECT * FROM Alumno";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                alumnos.add(new Alumno(
                    rs.getInt("Alumno_Codigo"),
                    rs.getString("Alumno_Nombres"),
                    rs.getString("Alumno_Apellidos"),
                    rs.getString("Alumno_Email"),
                    rs.getString("Alumno_QR"),
                    rs.getString("Alumno_Imagen_Rostro"),
                    rs.getString("Alumno_Carrera_Profesional"),
                    rs.getString("Alumno_Estado")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alumnos;
    }

    @Override
    public void addAlumno(Alumno alumno) {
        String query = "INSERT INTO Alumno (Alumno_Nombres, Alumno_Apellidos, Alumno_Email, Alumno_QR, Alumno_Imagen_Rostro, Alumno_Carrera_Profesional, Alumno_Estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, alumno.getAlumnoNombres());
            stmt.setString(2, alumno.getAlumnoApellidos());
            stmt.setString(3, alumno.getAlumnoEmail());
            stmt.setString(4, alumno.getAlumnoQR());
            stmt.setString(5, alumno.getAlumnoImagenRostro());
            stmt.setString(6, alumno.getAlumnoCarreraProfesional());
            stmt.setString(7, alumno.getAlumnoEstado());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateAlumno(Alumno alumno) {
        String query = "UPDATE Alumno SET Alumno_Nombres = ?, Alumno_Apellidos = ?, Alumno_Email = ?, Alumno_QR = ?, Alumno_Imagen_Rostro = ?, Alumno_Carrera_Profesional = ?, Alumno_Estado = ? WHERE Alumno_Codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, alumno.getAlumnoNombres());
            stmt.setString(2, alumno.getAlumnoApellidos());
            stmt.setString(3, alumno.getAlumnoEmail());
            stmt.setString(4, alumno.getAlumnoQR());
            stmt.setString(5, alumno.getAlumnoImagenRostro());
            stmt.setString(6, alumno.getAlumnoCarreraProfesional());
            stmt.setString(7, alumno.getAlumnoEstado());
            stmt.setInt(8, alumno.getAlumnoCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAlumno(int id) {
        String query = "DELETE FROM Alumno WHERE Alumno_Codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
