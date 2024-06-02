package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.Profesor;
import java.util.List;

public interface ProfesorDAO {
    Profesor getProfesorById(int id);
    List<Profesor> getAllProfesores();
    void addProfesor(Profesor profesor);
    void updateProfesor(Profesor profesor);
    void deleteProfesor(int id);
}
