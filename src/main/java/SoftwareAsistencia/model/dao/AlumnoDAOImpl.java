package SoftwareAsistencia.model.dao;

import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.Asistencia;
import SoftwareAsistencia.model.ConexionSQL;
import SoftwareAsistencia.model.Curso;
import SoftwareAsistencia.model.interfaz.AlumnoDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAOImpl implements AlumnoDAO {

    @Override
    public void guardarImagen(String alumnoCodigo, String imagenRostro) throws SQLException {
        String sqlUpdate = "UPDATE Alumno SET Alumno_Imagen_Rostro = ? WHERE Alumno_Cdg= ?";
        String sqlSelect = "SELECT COUNT(*) FROM Alumno WHERE Alumno_Cdg = ?";

        try (Connection conexion = ConexionSQL.obtenerConexion();
             PreparedStatement selectStatement = conexion.prepareStatement(sqlSelect)) {
            selectStatement.setString(1, alumnoCodigo);
            ResultSet resultSet = selectStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            if (count == 0) {
                throw new SQLException("No se encontró el alumno con el código " + alumnoCodigo);
            }
        }

        try (Connection conexion = ConexionSQL.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(sqlUpdate)) {
            statement.setString(1, imagenRostro);
            statement.setString(2, alumnoCodigo);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas == 0) {
                throw new SQLException("No se encontró el alumno con el código " + alumnoCodigo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error al guardar la imagen del alumno en la base de datos.");
        }
    }

    @Override
    public List<Alumno> obtenerAlumnosPorFiltros(String alumnoCodigo, String nombre, String apellido) throws SQLException {
        String sqlSelect = "SELECT * FROM Alumno WHERE Alumno_Cdg = ? AND Alumno_Nombres LIKE ? AND Alumno_Apellidos LIKE ?";
        List<Alumno> alumnos = new ArrayList<>();

        try (Connection conexion = ConexionSQL.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(sqlSelect)) {
            statement.setString(1, alumnoCodigo);
            statement.setString(2, "%" + nombre + "%");
            statement.setString(3, "%" + apellido + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Alumno alumno = new Alumno(
                                                resultSet.getInt("Alumno_Codigo"), resultSet.getString("Alumno_Nombres"),
                        resultSet.getString("Alumno_Apellidos"),
                        resultSet.getString("Alumno_Email"),
                        resultSet.getString("Alumno_QR"),
                        resultSet.getString("Alumno_Imagen_Rostro"),
                        resultSet.getString("Alumno_Carrera_Profesional"), 
                        resultSet.getString("Alumno_Estado"), resultSet.getString("Alumno_Cdg"));
                alumnos.add(alumno);
            }
        }
        return alumnos;
    }
    
    
    
     @Override
    public List<Alumno> obtenerTodosLosAlumnos() throws SQLException {
        String sqlSelect = "SELECT * FROM Alumno";
        List<Alumno> alumnos = new ArrayList<>();

        try (Connection conexion = ConexionSQL.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(sqlSelect);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Alumno alumno = new Alumno(
                        resultSet.getInt("Alumno_Codigo"),
                        resultSet.getString("Alumno_Nombres"),
                        resultSet.getString("Alumno_Apellidos"),
                        resultSet.getString("Alumno_Email"),
                        resultSet.getString("Alumno_QR"),
                        resultSet.getString("Alumno_Imagen_Rostro"),
                        resultSet.getString("Alumno_Carrera_Profesional"),
                        resultSet.getString("Alumno_Estado"),
                        resultSet.getString("Alumno_Cdg")
                );
                alumnos.add(alumno);
            }
        }
        return alumnos;
    }
    
  @Override
public List<Alumno> obtenerAlumnosPorFiltROS(String cursoNombre, String alumnoCdg, String ciclo, String alumnoCarreraProfesional) 
        throws SQLException {
    List<Alumno> alumnos = new ArrayList<>();
    String sql = "{CALL sp_ObtenerDatosAlumnosFiltrado(?, ?, ?, ?)}";
    try (Connection conexion = ConexionSQL.obtenerConexion();
         CallableStatement statement = conexion.prepareCall(sql)) {
        statement.setString(1, cursoNombre);
        statement.setString(2, alumnoCdg);
        statement.setString(3, ciclo);
        statement.setString(4, alumnoCarreraProfesional);

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Alumno alumno = new Alumno(
                        resultSet.getString("Alumno_Cdg"),
                        resultSet.getString("Alumno_Nombres"),
                        resultSet.getString("Alumno_Apellidos"),
                        resultSet.getString("Alumno_Email"),
                        resultSet.getString("Alumno_Carrera_Profesional"),
                        resultSet.getString("Ciclo"),
                        new Asistencia(
                                resultSet.getFloat("Asistencia_Porcentaje"),
                                resultSet.getString("Asistencia_Estado")
                        ),
                        new Curso(resultSet.getString("Curso_Nombre"))
                );
                alumnos.add(alumno);
            }
        }
    }

    return alumnos;
}

    @Override
public List<Alumno> obtenerTodosLosAlumno() throws SQLException {
    List<Alumno> alumnos = new ArrayList<>();

    String sql = "{CALL sp_ObtenerDatosAlumnos}";

    try (Connection conexion = ConexionSQL.obtenerConexion();
         CallableStatement statement = conexion.prepareCall(sql);
         ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
            Alumno alumno = new Alumno(
                    resultSet.getString("Alumno_Cdg"),
                    resultSet.getString("Alumno_Nombres"),
                    resultSet.getString("Alumno_Apellidos"),
                    resultSet.getString("Alumno_Email"),
                    resultSet.getString("Alumno_Carrera_Profesional"),
                    resultSet.getString("Ciclo"),
                    new Asistencia(
                            resultSet.getFloat("Asistencia_Porcentaje"),
                            resultSet.getString("Asistencia_Estado")
                    ),
                    new Curso(resultSet.getString("Curso_Nombre"))
            );
            alumnos.add(alumno);
        }
    }

    return alumnos;
}

@Override
public void guardarQR(String alumnoCodigo, byte[] imagenBytes) throws SQLException {
        String sqlUpdate = "UPDATE Alumno SET Alumno_QR = ? WHERE Alumno_Cdg = ?";
        String sqlSelect = "SELECT COUNT(*) FROM Alumno WHERE Alumno_Cdg = ?";

        try (Connection conexion = ConexionSQL.obtenerConexion();
             PreparedStatement selectStatement = conexion.prepareStatement(sqlSelect)) {
            selectStatement.setString(1, alumnoCodigo);
            if (!selectStatement.executeQuery().next()) {
                throw new SQLException("No se encontró el alumno con el código " + alumnoCodigo);
            }
        }

        try (Connection conexion = ConexionSQL.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(sqlUpdate)) {
            statement.setBytes(1, imagenBytes);
            statement.setString(2, alumnoCodigo);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas == 0) {
                throw new SQLException("No se encontró el alumno con el código " + alumnoCodigo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error al guardar el código QR del alumno en la base de datos.");
        }
    }
}