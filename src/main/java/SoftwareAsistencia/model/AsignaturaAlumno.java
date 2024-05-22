package SoftwareAsistencia.model;

/**
 *
 * @author elnoe
 */
public class AsignaturaAlumno {

        private int ID_AlumnoAsignatura;

        private int ID_Alumno;

        private int ID_Asignatura;

        public AsignaturaAlumno() {
        }

        public AsignaturaAlumno(int ID_AlumnoAsignatura, int ID_Alumno, int ID_Asignatura) {
                this.ID_AlumnoAsignatura = ID_AlumnoAsignatura;
                this.ID_Alumno = ID_Alumno;
                this.ID_Asignatura = ID_Asignatura;
        }

        public int getID_AlumnoAsignatura() {
                return ID_AlumnoAsignatura;
        }

        public void setID_AlumnoAsignatura(int ID_AlumnoAsignatura) {
                this.ID_AlumnoAsignatura = ID_AlumnoAsignatura;
        }

        public int getID_Alumno() {
                return ID_Alumno;
        }

        public void setID_Alumno(int ID_Alumno) {
                this.ID_Alumno = ID_Alumno;
        }

        public int getID_Asignatura() {
                return ID_Asignatura;
        }

        public void setID_Asignatura(int ID_Asignatura) {
                this.ID_Asignatura = ID_Asignatura;
        }

        @Override
        public String toString() {
                return ID_AlumnoAsignatura + "," + ID_Alumno + "," + ID_Asignatura;
        }

}
