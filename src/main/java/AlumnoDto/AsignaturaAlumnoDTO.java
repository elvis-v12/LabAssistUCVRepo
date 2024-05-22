/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlumnoDto;

import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.Asignatura;

/**
 *
 * @author elnoe
 */
public class AsignaturaAlumnoDTO {

        private int ID_AlumnoAsignatura;

        private Alumno alumno;

        private Asignatura asignatura;

        public AsignaturaAlumnoDTO() {
        }

        public AsignaturaAlumnoDTO(int ID_AlumnoAsignatura, Alumno alumno, Asignatura asignatura) {
                this.ID_AlumnoAsignatura = ID_AlumnoAsignatura;
                this.alumno = alumno;
                this.asignatura = asignatura;
        }

        public int getID_AlumnoAsignatura() {
                return ID_AlumnoAsignatura;
        }

        public void setID_AlumnoAsignatura(int ID_AlumnoAsignatura) {
                this.ID_AlumnoAsignatura = ID_AlumnoAsignatura;
        }

        public Alumno getAlumno() {
                return alumno;
        }

        public void setAlumno(Alumno alumno) {
                this.alumno = alumno;
        }

        public Asignatura getAsignatura() {
                return asignatura;
        }

        public void setAsignatura(Asignatura asignatura) {
                this.asignatura = asignatura;
        }

        @Override
        public String toString() {
                return ID_AlumnoAsignatura + "," + alumno.toString() + "," + asignatura.toString();
        }

}
