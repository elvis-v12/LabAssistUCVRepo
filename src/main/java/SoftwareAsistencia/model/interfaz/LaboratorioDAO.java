package SoftwareAsistencia.model.interfaz;


import SoftwareAsistencia.model.Laboratorio;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public interface LaboratorioDAO {
    List<Laboratorio> obtenerDatosLaboratorio(Timestamp horarioHoraInicio, Timestamp horarioHoraFin, int laboratorioUbicacion, String laboratorioNombre) throws SQLException;
}
