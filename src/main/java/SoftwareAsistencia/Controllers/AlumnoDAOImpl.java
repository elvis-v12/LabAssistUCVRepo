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

    @Override
    public Alumno getAlumnoById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Alumno> getAllAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
