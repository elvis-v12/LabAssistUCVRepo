package SoftwareAsistencia.Controllers;

import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.Asistencia;
import SoftwareAsistencia.model.ConexionSQL;
import SoftwareAsistencia.model.Curso;
import SoftwareAsistencia.model.interfaz.AsistenciaDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AsistenciDAOImpl implements AsistenciaDAO {
    private ConexionSQL conexionSQL;

    public AsistenciDAOImpl(ConexionSQL conexionSQL) {
        this.conexionSQL = conexionSQL;
    }

    @Override
    public List<Alumno> obtenerAlumnosConAsistencias(int alumnoCodigo) {
        List<Alumno> alumnos = new ArrayList<>();
        String query = "SELECT A.Alumno_Codigo, A.Alumno_Nombres, A.Alumno_Apellidos, A.Alumno_Email, "
                     + "A.Alumno_Carrera_Profesional, "
                     + "C.Curso_Nombre, "
                     + "SUM(CASE WHEN ASI.Asistencia_Estado = 'Presente' THEN 1 ELSE 0 END) AS Asistencias, "
                     + "SUM(CASE WHEN ASI.Asistencia_Estado = 'Ausente' THEN 1 ELSE 0 END) AS Faltas "
                     + "FROM Alumno A "
                     + "JOIN Asistencia ASI ON A.Alumno_Codigo = ASI.Asistencia_Alumno_ID "
                     + "JOIN Horario H ON ASI.Asistencia_Horario_ID = H.Horario_ID "
                     + "JOIN Curso C ON H.Horario_Curso_ID = C.Curso_ID "
                     + "WHERE A.Alumno_Codigo = ? "
                     + "GROUP BY A.Alumno_Codigo, A.Alumno_Nombres, A.Alumno_Apellidos, A.Alumno_Email, "
                     + "A.Alumno_Carrera_Profesional, C.Curso_Nombre";

        try (Connection conexion = ConexionSQL.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement(query)) {

            statement.setInt(1, alumnoCodigo);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    // Crear objeto Curso
                    Curso curso = new Curso(
                        resultSet.getString("Curso_Nombre")
                    );

                    // Crear objeto Asistencia
                    Asistencia asistencia = new Asistencia(
                        resultSet.getInt("Asistencias"),
                        resultSet.getInt("Faltas")
                    );

                    // Crear objeto Alumno y asociar Curso y Asistencia
                    Alumno alumno = new Alumno(
                        resultSet.getInt("Alumno_Codigo"),
                        resultSet.getString("Alumno_Nombres"),
                        resultSet.getString("Alumno_Apellidos"),
                        resultSet.getString("Alumno_Email"),
                        null, // Alumno_QR
                        null, // Alumno_Imagen_Rostro
                        resultSet.getString("Alumno_Carrera_Profesional"),
                        null, // Alumno_Estado
                        asistencia // Asociar Asistencia
                    );
                    asistencia.setCursoNombre(curso.getCursoNombre()); // Asociar Curso

                    alumnos.add(alumno);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alumnos;
    }
}
