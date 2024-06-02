package SoftwareAsistencia.model;
public class Profesor {
    private int profesorCodigo;
    private String profesorNombres;
    private String profesorApellidos;
    private String profesorEmail;
    private String profesorEspecialidad;
    private String profesorTelefono;

   

    public Profesor(int profesorCodigo, String profesorNombres, String profesorApellidos, String profesorEmail, String profesorEspecialidad, String profesorTelefono) {
        this.profesorCodigo = profesorCodigo;
        this.profesorNombres = profesorNombres;
        this.profesorApellidos = profesorApellidos;
        this.profesorEmail = profesorEmail;
        this.profesorEspecialidad = profesorEspecialidad;
        this.profesorTelefono = profesorTelefono;
    }

    public int getProfesorCodigo() {
        return profesorCodigo;
    }

    public void setProfesorCodigo(int profesorCodigo) {
        this.profesorCodigo = profesorCodigo;
    }

    public String getProfesorNombres() {
        return profesorNombres;
    }

    public void setProfesorNombres(String profesorNombres) {
        this.profesorNombres = profesorNombres;
    }

    public String getProfesorApellidos() {
        return profesorApellidos;
    }

    public void setProfesorApellidos(String profesorApellidos) {
        this.profesorApellidos = profesorApellidos;
    }

    public String getProfesorEmail() {
        return profesorEmail;
    }

    public void setProfesorEmail(String profesorEmail) {
        this.profesorEmail = profesorEmail;
    }

    public String getProfesorEspecialidad() {
        return profesorEspecialidad;
    }

    public void setProfesorEspecialidad(String profesorEspecialidad) {
        this.profesorEspecialidad = profesorEspecialidad;
    }

    public String getProfesorTelefono() {
        return profesorTelefono;
    }

    public void setProfesorTelefono(String profesorTelefono) {
        this.profesorTelefono = profesorTelefono;
    }
    
}
