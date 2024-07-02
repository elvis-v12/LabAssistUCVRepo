package SoftwareAsistencia.model;

public class Curso {
    private int cursoID;
    private String cursoNombre;
    private int cursoTotalAlumnos;
    private int cursoProfesorCodigo;
    private Horario horario;
    private Laboratorio laboratorio;

    public Curso(int cursoID, String cursoNombre, int cursoTotalAlumnos, int cursoProfesorCodigo, Horario horario, Laboratorio laboratorio) {
        this.cursoID = cursoID;
        this.cursoNombre = cursoNombre;
        this.cursoTotalAlumnos = cursoTotalAlumnos;
        this.cursoProfesorCodigo = cursoProfesorCodigo;
        this.horario = horario;
        this.laboratorio = laboratorio;
    }

    public Curso() {
    }

    public Curso(String cursoNombre) {
        this.cursoNombre = cursoNombre;
    }

    public Curso(int cursoID, String cursoNombre, int cursoTotalAlumnos, int cursoProfesorCodigo) {
        this.cursoID = cursoID;
        this.cursoNombre = cursoNombre;
        this.cursoTotalAlumnos = cursoTotalAlumnos;
        this.cursoProfesorCodigo = cursoProfesorCodigo;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    // Getters y setters aquí

    public int getCursoID() {
        return cursoID;
    }

    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }

    public String getCursoNombre() {
        return cursoNombre;
    }

    public void setCursoNombre(String cursoNombre) {
        this.cursoNombre = cursoNombre;
    }

    public int getCursoTotalAlumnos() {
        return cursoTotalAlumnos;
    }

    public void setCursoTotalAlumnos(int cursoTotalAlumnos) {
        this.cursoTotalAlumnos = cursoTotalAlumnos;
    }

    public int getCursoProfesorCodigo() {
        return cursoProfesorCodigo;
    }

    public void setCursoProfesorCodigo(int cursoProfesorCodigo) {
        this.cursoProfesorCodigo = cursoProfesorCodigo;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
