package SoftwareAsistencia.controller;

import SoftwareAsistencia.service.AsignaturaDaoImplement;
import SoftwareAsistencia.model.Asignatura;
import java.util.List;

/**
 *
 * @author elnoe
 */
public class AsignaturaController {

        private static final AsignaturaDaoImplement ASIGNATURA_DAO = new AsignaturaDaoImplement();

        public void create(Asignatura asignatura) {
                throw new UnsupportedOperationException("Not supported yet.");
        }

        public Asignatura read(Integer id) {
                throw new UnsupportedOperationException("Not supported yet.");
        }

        public List<Asignatura> readAll() {
                return ASIGNATURA_DAO.readAll();
        }

        public Asignatura update(Asignatura asignatura) {
                throw new UnsupportedOperationException("Not supported yet.");
        }

        public void delete(Integer id) {
                throw new UnsupportedOperationException("Not supported yet.");
        }

}
