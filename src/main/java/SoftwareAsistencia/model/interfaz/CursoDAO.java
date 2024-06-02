package SoftwareAsistencia.model.interfaz;
import SoftwareAsistencia.model.Curso;
import java.util.List;

public interface CursoDAO {
    Curso getCursoById(int id);
    List<Curso> getAllCursos();
    void addCurso(Curso curso);
    void updateCurso(Curso curso);
    void deleteCurso(int id);
}
