package SoftwareAsistencia.model.interfaz;

import SoftwareAsistencia.model.Alumno;

import java.sql.SQLException;
import java.util.List;

public interface AlumnoDAO {
    void guardarImagen(String alumnoCodigo, String imagenRostro) throws SQLException;
    List<Alumno> obtenerAlumnosPorFiltros(String alumnoCodigo, String nombre, String apellido) throws SQLException;
    List<Alumno> obtenerTodosLosAlumnos() throws SQLException;
        List<Alumno> obtenerAlumnosPorFiltROS(String cursoNombre, String alumnoCdg, String ciclo, String alumnoCarreraProfesional) throws SQLException;
    List<Alumno> obtenerTodosLosAlumno() throws SQLException;

}
