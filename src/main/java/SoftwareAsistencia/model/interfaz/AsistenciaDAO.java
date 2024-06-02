package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.Asistencia;
import java.util.List;

public interface AsistenciaDAO {
    Asistencia getAsistenciaById(int id);
    List<Asistencia> getAllAsistencias();
    void addAsistencia(Asistencia asistencia);
    void updateAsistencia(Asistencia asistencia);
    void deleteAsistencia(int id);
}
