package SoftwareAsistencia.model;
public class Alumno {
    private int alumnoCodigo;
    private String alumnoNombres;
    private String alumnoApellidos;
    private String alumnoEmail;
    private String alumnoQR;
    private String alumnoImagenRostro;
    private String alumnoCarreraProfesional;
    private String alumnoEstado;

    public Alumno(int alumnoCodigo, String alumnoNombres, String alumnoApellidos, String alumnoEmail, String alumnoQR, String alumnoImagenRostro, String alumnoCarreraProfesional, String alumnoEstado) {
        this.alumnoCodigo = alumnoCodigo;
        this.alumnoNombres = alumnoNombres;
        this.alumnoApellidos = alumnoApellidos;
        this.alumnoEmail = alumnoEmail;
        this.alumnoQR = alumnoQR;
        this.alumnoImagenRostro = alumnoImagenRostro;
        this.alumnoCarreraProfesional = alumnoCarreraProfesional;
        this.alumnoEstado = alumnoEstado;
    }

    public int getAlumnoCodigo() {
        return alumnoCodigo;
    }

    public void setAlumnoCodigo(int alumnoCodigo) {
        this.alumnoCodigo = alumnoCodigo;
    }

    public String getAlumnoNombres() {
        return alumnoNombres;
    }

    public void setAlumnoNombres(String alumnoNombres) {
        this.alumnoNombres = alumnoNombres;
    }

    public String getAlumnoApellidos() {
        return alumnoApellidos;
    }

    public void setAlumnoApellidos(String alumnoApellidos) {
        this.alumnoApellidos = alumnoApellidos;
    }

    public String getAlumnoEmail() {
        return alumnoEmail;
    }

    public void setAlumnoEmail(String alumnoEmail) {
        this.alumnoEmail = alumnoEmail;
    }

    public String getAlumnoQR() {
        return alumnoQR;
    }

    public void setAlumnoQR(String alumnoQR) {
        this.alumnoQR = alumnoQR;
    }

    public String getAlumnoImagenRostro() {
        return alumnoImagenRostro;
    }

    public void setAlumnoImagenRostro(String alumnoImagenRostro) {
        this.alumnoImagenRostro = alumnoImagenRostro;
    }

    public String getAlumnoCarreraProfesional() {
        return alumnoCarreraProfesional;
    }

    public void setAlumnoCarreraProfesional(String alumnoCarreraProfesional) {
        this.alumnoCarreraProfesional = alumnoCarreraProfesional;
    }

    public String getAlumnoEstado() {
        return alumnoEstado;
    }

    public void setAlumnoEstado(String alumnoEstado) {
        this.alumnoEstado = alumnoEstado;
    }

    
}