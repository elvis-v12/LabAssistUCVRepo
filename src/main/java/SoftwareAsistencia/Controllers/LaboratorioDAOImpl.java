package SoftwareAsistencia.Controllers;

import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.Asistencia;
import SoftwareAsistencia.model.ConexionSQL;
import SoftwareAsistencia.model.Curso;
import SoftwareAsistencia.model.Horario;
import SoftwareAsistencia.model.Laboratorio;
import SoftwareAsistencia.model.interfaz.LaboratorioDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaboratorioDAOImpl implements LaboratorioDAO {
    private Connection connection;

    public LaboratorioDAOImpl(Connection connection) {
        this.connection = connection;
    }

   @Override
public List<Laboratorio> obtenerLaboratoriosConAsistencias(int laboratorioNumero) {
    List<Laboratorio> laboratorios = new ArrayList<>();
    
    String query = "SELECT " +
                   "    H.Horario_ID, " +
                   "    C.Curso_Nombre, " +
                   "    A.Alumno_Codigo, " +
                   "    A.Alumno_Nombres, " +
                   "    A.Alumno_Apellidos, " +
                   "    L.Laboratorio_Nombre, " +
                   "    L.Laboratorio_Capacidad, " +
                   "    COUNT(CASE WHEN Asis.Asistencia_Estado = 'Presente' THEN 1 END) AS Asistencias, " +
                   "    COUNT(CASE WHEN Asis.Asistencia_Estado != 'Presente' THEN 1 END) AS Faltas " +
                   "FROM " +
                   "    Asistencia Asis " +
                   "    INNER JOIN Alumno A ON Asis.Asistencia_Alumno_ID = A.Alumno_Codigo " +
                   "    INNER JOIN Horario H ON Asis.Asistencia_Horario_ID = H.Horario_ID " +
                   "    INNER JOIN Curso C ON H.Horario_Curso_ID = C.Curso_ID " +
                   "    INNER JOIN Laboratorio L ON H.Horario_Laboratorio_ID = L.Laboratorio_ID " +
                   "WHERE L.Laboratorio_ID = ? " +
                   "GROUP BY " +
                   "    H.Horario_ID, " +
                   "    C.Curso_Nombre, " +
                   "    A.Alumno_Codigo, " +
                   "    A.Alumno_Nombres, " +
                   "    A.Alumno_Apellidos, " +
                   "    L.Laboratorio_Nombre, " +
                   "    L.Laboratorio_Capacidad " +
                   "ORDER BY " +
                   "    H.Horario_ID, " +
                   "    C.Curso_Nombre, " +
                   "    A.Alumno_Nombres, " +
                   "    A.Alumno_Apellidos";

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setInt(1, laboratorioNumero);

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                // Crear objetos basados en los datos obtenidos
                Horario horario = new Horario(
                    resultSet.getInt("Horario_ID"),
                    0, // horarioCursoID, no utilizado directamente
                    0, // horarioLaboratorioID, no utilizado directamente
                    "", // horarioDiaSemana, no utilizado directamente
                    null, // horarioHoraInicio, no utilizado directamente
                    null // horarioHoraFin, no utilizado directamente
                );

                Curso curso = new Curso(
                    resultSet.getString("Curso_Nombre")
                );

                Alumno alumno = new Alumno(
                    resultSet.getInt("Alumno_Codigo"), // Corregido Alumno_Codigo
                    resultSet.getString("Alumno_Nombres"),
                    resultSet.getString("Alumno_Apellidos"),
                    "", // Alumno_Email, no utilizado directamente
                    "", // Alumno_QR, no utilizado directamente
                    "", // Alumno_Imagen_Rostro, no utilizado directamente
                    "", // Alumno_Carrera_Profesional, no utilizado directamente
                    "", // Alumno_Estado, no utilizado directamente
                    null // Asistencia, se agregará más adelante
                );

                Asistencia asistencia = new Asistencia(
                    resultSet.getInt("Asistencias"),
                    resultSet.getInt("Faltas")
                );

                Laboratorio laboratorio = new Laboratorio(
                    resultSet.getInt("Horario_ID"),
                    resultSet.getString("Laboratorio_Nombre"),
                    resultSet.getInt("Laboratorio_Capacidad")
                );

                laboratorio.setHorario(horario);
                laboratorio.setCursos(curso);
                laboratorio.setAlumno(alumno);
                laboratorio.setAsistencia(asistencia);

                laboratorios.add(laboratorio);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return laboratorios;
}

}
