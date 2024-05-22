package SoftwareAsistencia.dto;

/**
 *
 * @author elnoe
 */
public class AlumnoDto {

        private int ID_Alumno;

        private String nombre;

        public AlumnoDto(int ID_Alumno, String nombre) {
                this.ID_Alumno = ID_Alumno;
                this.nombre = nombre;
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

        @Override
        public String toString() {
                return ID_Alumno + "," + nombre;
        }

}
