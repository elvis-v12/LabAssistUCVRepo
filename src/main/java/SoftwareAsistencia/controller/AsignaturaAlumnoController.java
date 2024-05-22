package SoftwareAsistencia.controller;

import SoftwareAsistencia.model.AsignaturaAlumno;
import SoftwareAsistencia.service.AsignaturaAlumnoDaoImplement;
import java.util.List;

/**
 *
 * @author elnoe
 */
public class AsignaturaAlumnoController {

        private static final AsignaturaAlumnoDaoImplement ASIGNATURA_ALUMNO_DAO = new AsignaturaAlumnoDaoImplement();

        public List<AsignaturaAlumno> readAll() {
                return ASIGNATURA_ALUMNO_DAO.readAll();
        }

}
