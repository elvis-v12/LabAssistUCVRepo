package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.Laboratorio;
import java.util.List;

public interface LaboratorioDAO {
    Laboratorio getLaboratorioById(int id);
    List<Laboratorio> getAllLaboratorios();
    void addLaboratorio(Laboratorio laboratorio);
    void updateLaboratorio(Laboratorio laboratorio);
    void deleteLaboratorio(int id);
}
