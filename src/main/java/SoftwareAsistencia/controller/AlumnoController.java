package SoftwareAsistencia.controller;

import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.service.AlumnoDaoImplement;
import java.util.List;

/**
 *
 * @author elnoe
 */
public class AlumnoController {

        private static final AlumnoDaoImplement ALUMNO_DAO = new AlumnoDaoImplement();

        public List<Alumno> readAll() {
                return ALUMNO_DAO.readAll();
        }

}
