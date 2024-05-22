package SoftwareAsistencia.model;

/**
 *
 * @author elnoe
 */
public class Alumno {

        private int ID_Alumno;

        private String nombre;

        private String apellido_paterno;

        private String apellido_materno;

        public Alumno() {
        }

        public Alumno(int ID_Alumno, String nombre, String apellido_paterno, String apellido_materno) {
                this.ID_Alumno = ID_Alumno;
                this.nombre = nombre;
                this.apellido_paterno = apellido_paterno;
                this.apellido_materno = apellido_materno;
        }

        public int getID_Alumno() {
                return ID_Alumno;
        }

        public void setID_Alumno(int ID_Alumno) {
                this.ID_Alumno = ID_Alumno;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido_paterno() {
                return apellido_paterno;
        }

        public void setApellido_paterno(String apellido_paterno) {
                this.apellido_paterno = apellido_paterno;
        }

        public String getApellido_materno() {
                return apellido_materno;
        }

        public void setApellido_materno(String apellido_materno) {
                this.apellido_materno = apellido_materno;
        }

        @Override
        public String toString() {
                return ID_Alumno + "," + nombre + "," + apellido_paterno + "," + apellido_materno;
        }

}
