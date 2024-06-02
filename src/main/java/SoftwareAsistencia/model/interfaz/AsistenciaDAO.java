package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.Asistencia;
import java.util.List;

public interface AsistenciaDAO {
    List<Alumno> obtenerAlumnosConAsistencias(int alumnoCodigo);

}
