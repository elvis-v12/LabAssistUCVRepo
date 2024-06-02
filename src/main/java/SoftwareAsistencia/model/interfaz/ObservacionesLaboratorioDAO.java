package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.ObservacionesLaboratorio;
import java.util.List;

public interface ObservacionesLaboratorioDAO {
    ObservacionesLaboratorio getObservacionById(int id);
    List<ObservacionesLaboratorio> getAllObservaciones();
    void addObservacion(ObservacionesLaboratorio observacion);
    void updateObservacion(ObservacionesLaboratorio observacion);
    void deleteObservacion(int id);
}
