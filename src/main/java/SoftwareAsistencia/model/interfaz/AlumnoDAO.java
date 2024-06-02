package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.Alumno;
import java.util.List;

public interface AlumnoDAO {
    Alumno getAlumnoById(int id);
    List<Alumno> getAllAlumnos();
    void addAlumno(Alumno alumno);
    void updateAlumno(Alumno alumno);
    void deleteAlumno(int id);
}
