package SoftwareAsistencia.Controllers;
import SoftwareAsistencia.model.Curso;
import SoftwareAsistencia.model.interfaz.CursoDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoDAOImpl implements CursoDAO {
    private Connection connection;

    public CursoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Curso getCursoById(int id) {
        String query = "SELECT * FROM Curso WHERE Curso_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Curso(
                    rs.getInt("Curso_ID"),
                    rs.getString("Curso_Nombre"),
                    rs.getInt("Curso_Total_Alumnos"),
                    rs.getInt("Curso_Profesor_Codigo")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Curso> getAllCursos() {
        List<Curso> cursos = new ArrayList<>();
        String query = "SELECT * FROM Curso";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                cursos.add(new Curso(
                    rs.getInt("Curso_ID"),
                    rs.getString("Curso_Nombre"),
                    rs.getInt("Curso_Total_Alumnos"),
                    rs.getInt("Curso_Profesor_Codigo")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cursos;
    }

    @Override
    public void addCurso(Curso curso) {
        String query = "INSERT INTO Curso (Curso_Nombre, Curso_Total_Alumnos, Curso_Profesor_Codigo) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, curso.getCursoNombre());
            stmt.setInt(2, curso.getCursoTotalAlumnos());
            stmt.setInt(3, curso.getCursoProfesorCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCurso(Curso curso) {
        String query = "UPDATE Curso SET Curso_Nombre = ?, Curso_Total_Alumnos = ?, Curso_Profesor_Codigo = ? WHERE Curso_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, curso.getCursoNombre());
            stmt.setInt(2, curso.getCursoTotalAlumnos());
            stmt.setInt(3, curso.getCursoProfesorCodigo());
            stmt.setInt(4, curso.getCursoID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCurso(int id) {
        String query = "DELETE FROM Curso WHERE Curso_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
