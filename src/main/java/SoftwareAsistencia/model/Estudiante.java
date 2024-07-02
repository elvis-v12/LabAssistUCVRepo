
package SoftwareAsistencia.model;

/**
 *
 * @author ELVIS
 */
public class Estudiante {
    private int codigo;
    private String nombres;
    private String apellidos;
    private String email;
    private String curso;
    private String carrera;
    private float asistencias;
    private String faltas;
    private String ciclo;

    // Constructor, getters y setters
    public Estudiante(int codigo, String nombres, String apellidos, String email, String curso, String carrera, float asistencias, String faltas, String ciclo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.curso = curso;
        this.carrera = carrera;
        this.asistencias = asistencias;
        this.faltas = faltas;
        this.ciclo = ciclo;
    }

    // Getters y setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public float getAsistencias() { return asistencias; }
    public void setAsistencias(float asistencias) { this.asistencias = asistencias; }

    public String getFaltas() { return faltas; }
    public void setFaltas(String faltas) { this.faltas = faltas; }

    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
}