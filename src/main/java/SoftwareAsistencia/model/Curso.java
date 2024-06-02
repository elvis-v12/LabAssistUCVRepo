package SoftwareAsistencia.model;
public class Curso {
    private int cursoID;
    private String cursoNombre;
    private int cursoTotalAlumnos;
    private int cursoProfesorCodigo;

    public Curso(int cursoID, String cursoNombre, int cursoTotalAlumnos, int cursoProfesorCodigo) {
        this.cursoID = cursoID;
        this.cursoNombre = cursoNombre;
        this.cursoTotalAlumnos = cursoTotalAlumnos;
        this.cursoProfesorCodigo = cursoProfesorCodigo;
    }

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

    
}