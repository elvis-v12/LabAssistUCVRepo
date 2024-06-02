package SoftwareAsistencia.model;

public class Laboratorio {
    private int laboratorioID;
    private String laboratorioNombre;
    private int laboratorioUbicacion;
    private int laboratorioCapacidad;
     private  Alumno Alumno;
     private Asistencia Asistencia;
     private Curso Curso;
     private Horario Horario;
 private Laboratorio Laboratorio;

    public Laboratorio(int laboratorioID, String laboratorioNombre, int laboratorioUbicacion, int laboratorioCapacidad, Alumno Alumno, Asistencia Asistencia, Curso Curso, Horario Horario, Laboratorio Laboratorio) {
        this.laboratorioID = laboratorioID;
        this.laboratorioNombre = laboratorioNombre;
        this.laboratorioUbicacion = laboratorioUbicacion;
        this.laboratorioCapacidad = laboratorioCapacidad;
        this.Alumno = Alumno;
        this.Asistencia = Asistencia;
        this.Curso = Curso;
        this.Horario = Horario;
        this.Laboratorio = Laboratorio;
    }
  

    public Laboratorio(int laboratorioID, String laboratorioNombre, int laboratorioUbicacion, int laboratorioCapacidad, Alumno Alumno, Laboratorio Laboratorio) {
        this.laboratorioID = laboratorioID;
        this.laboratorioNombre = laboratorioNombre;
        this.laboratorioUbicacion = laboratorioUbicacion;
        this.laboratorioCapacidad = laboratorioCapacidad;
        this.Alumno = Alumno;
        this.Laboratorio = Laboratorio;
    }
    
    public Laboratorio(int laboratorioID, String laboratorioNombre, int laboratorioCapacidad) {
        this.laboratorioID = laboratorioID;
        this.laboratorioNombre = laboratorioNombre;
        this.laboratorioCapacidad = laboratorioCapacidad;
    }

    public Laboratorio(int laboratorioID, String laboratorioNombre, int laboratorioUbicacion, int laboratorioCapacidad, Laboratorio Laboratorio) {
        this.laboratorioID = laboratorioID;
        this.laboratorioNombre = laboratorioNombre;
        this.laboratorioUbicacion = laboratorioUbicacion;
        this.laboratorioCapacidad = laboratorioCapacidad;
        this.Laboratorio = Laboratorio;
    }

    public Laboratorio getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(Laboratorio Laboratorio) {
        this.Laboratorio = Laboratorio;
    }


    public int getLaboratorioID() {
        return laboratorioID;
    }

    public void setLaboratorioID(int laboratorioID) {
        this.laboratorioID = laboratorioID;
    }

    public String getLaboratorioNombre() {
        return laboratorioNombre;
    }

    public void setLaboratorioNombre(String laboratorioNombre) {
        this.laboratorioNombre = laboratorioNombre;
    }

    public int getLaboratorioUbicacion() {
        return laboratorioUbicacion;
    }

    public void setLaboratorioUbicacion(int laboratorioUbicacion) {
        this.laboratorioUbicacion = laboratorioUbicacion;
    }

    public int getLaboratorioCapacidad() {
        return laboratorioCapacidad;
    }

    public void setLaboratorioCapacidad(int laboratorioCapacidad) {
        this.laboratorioCapacidad = laboratorioCapacidad;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Asistencia getAsistencia() {
        return Asistencia;
    }

    public void setAsistencia(Asistencia Asistencia) {
        this.Asistencia = Asistencia;
    }

    public Curso getCursos() {
        return Curso;
    }

    public void setCursos(Curso Curso) {
        this.Curso = Curso;
    }

    public Horario getHorario() {
        return Horario;
    }

    public void setHorario(Horario Horario) {
        this.Horario = Horario;
    }
    
    
}
