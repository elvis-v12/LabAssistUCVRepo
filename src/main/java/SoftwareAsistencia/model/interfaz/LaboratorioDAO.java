package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.Laboratorio;
import java.util.List;

public interface LaboratorioDAO {
    List<Laboratorio> obtenerLaboratoriosConAsistencias(int laboratorioNumero);

}
