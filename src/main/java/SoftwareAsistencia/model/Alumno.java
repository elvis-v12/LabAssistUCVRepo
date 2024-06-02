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
    private Asistencia asistencia;
 private Laboratorio Laboratorio;
    public Alumno(int alumnoCodigo, String alumnoNombres, String alumnoApellidos, String alumnoEmail, String alumnoQR, String alumnoImagenRostro, String alumnoCarreraProfesional, String alumnoEstado, Asistencia asistencia) {
        this.alumnoCodigo = alumnoCodigo;
        this.alumnoNombres = alumnoNombres;
        this.alumnoApellidos = alumnoApellidos;
        this.alumnoEmail = alumnoEmail;
        this.alumnoQR = alumnoQR;
        this.alumnoImagenRostro = alumnoImagenRostro;
        this.alumnoCarreraProfesional = alumnoCarreraProfesional;
        this.alumnoEstado = alumnoEstado;
        this.asistencia = asistencia;
    }

    public Alumno(int alumnoCodigo, String alumnoNombres, String alumnoApellidos, String alumnoEmail, String alumnoQR, String alumnoImagenRostro, String alumnoCarreraProfesional, String alumnoEstado, Asistencia asistencia, Laboratorio Laboratorio) {
        this.alumnoCodigo = alumnoCodigo;
        this.alumnoNombres = alumnoNombres;
        this.alumnoApellidos = alumnoApellidos;
        this.alumnoEmail = alumnoEmail;
        this.alumnoQR = alumnoQR;
        this.alumnoImagenRostro = alumnoImagenRostro;
        this.alumnoCarreraProfesional = alumnoCarreraProfesional;
        this.alumnoEstado = alumnoEstado;
        this.asistencia = asistencia;
        this.Laboratorio = Laboratorio;
    }


  
    // Getters y setters aquí
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

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }

    public Laboratorio getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(Laboratorio Laboratorio) {
        this.Laboratorio = Laboratorio;
    }
    
}
