package SoftwareAsistencia.model.dao;


import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.Asistencia;
import SoftwareAsistencia.model.Curso;
import SoftwareAsistencia.model.Horario;
import SoftwareAsistencia.model.Laboratorio;
import SoftwareAsistencia.model.interfaz.LaboratorioDAO;
import SoftwareAsistencia.model.ConexionSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaboratorioDAOImpl implements LaboratorioDAO {

    @Override
public List<Laboratorio> obtenerDatosLaboratorio(Timestamp horarioHoraInicio, Timestamp horarioHoraFin, int laboratorioUbicacion, String laboratorioNombre) throws SQLException {
    List<Laboratorio> laboratorios = new ArrayList<>();
    String sql = "{CALL sp_ObtenerDatosLaboratorio(?, ?, ?, ?)}";

    try (Connection conexion = ConexionSQL.obtenerConexion();
         CallableStatement statement = conexion.prepareCall(sql)) {

        statement.setTimestamp(1, horarioHoraInicio);
        statement.setTimestamp(2, horarioHoraFin);
        statement.setInt(3, laboratorioUbicacion);
        statement.setString(4, laboratorioNombre);

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Laboratorio laboratorio = new Laboratorio(
                    resultSet.getInt("Laboratorio_ID"),  // Asegúrate de que esta columna esté presente en el ResultSet
                    resultSet.getString("Laboratorio_Nombre"),
                    resultSet.getInt("Laboratorio_Capacidad")
                );

                Alumno alumno = new Alumno();
                alumno.setAlumnoNombres(resultSet.getString("Alumno_Nombres"));
                alumno.setAlumnoApellidos(resultSet.getString("Alumno_Apellidos"));

                Asistencia asistencia = new Asistencia(
                    resultSet.getFloat("Asistencia_Porcentaje"),
                    resultSet.getString("Asistencia_Estado")
                );

                Curso curso = new Curso();
                curso.setCursoNombre(resultSet.getString("Curso_Nombre"));

                // Añadir datos al laboratorio
                laboratorio.setAlumno(alumno);
                laboratorio.setAsistencia(asistencia);
                laboratorio.setCursos(curso);

                laboratorios.add(laboratorio);
            }
        }
    }

    return laboratorios;
}
public List<Laboratorio> obtenerReporteLaboratorio() throws SQLException {
        List<Laboratorio> laboratorios = new ArrayList<>();
        String sql = "{CALL sp_ObtenerReporteLaboratorio}";

        try (Connection conexion = ConexionSQL.obtenerConexion();
             CallableStatement statement = conexion.prepareCall(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Laboratorio laboratorio = new Laboratorio(
                    resultSet.getInt("Laboratorio_ID"),  
                    resultSet.getString("Laboratorio_Nombre"),
                    resultSet.getInt("Laboratorio_Capacidad")
                );

                Alumno alumno = new Alumno();
                alumno.setAlumnoNombres(resultSet.getString("Alumno_Nombres"));
                alumno.setAlumnoApellidos(resultSet.getString("Alumno_Apellidos"));

                Asistencia asistencia = new Asistencia(
                    resultSet.getFloat("Asistencia_Porcentaje"),
                    resultSet.getString("Asistencia_Estado")
                );

                Curso curso = new Curso();
                curso.setCursoNombre(resultSet.getString("Curso_Nombre"));

                // Añadir datos al laboratorio
                laboratorio.setAlumno(alumno);
                laboratorio.setAsistencia(asistencia);
                laboratorio.setCursos(curso);

                laboratorios.add(laboratorio);
            }
        }

        return laboratorios;
    }
}
