package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.Horario;
import java.util.List;

public interface HorarioDAO {
    Horario getHorarioById(int id);
    List<Horario> getAllHorarios();
    void addHorario(Horario horario);
    void updateHorario(Horario horario);
    void deleteHorario(int id);
}
