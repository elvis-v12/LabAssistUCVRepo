package SoftwareAsistencia.model;

import java.sql.Date;

public class Asistencia {
    private int asistenciaID;
    private int asistenciaAlumnoID;
    private int asistenciaHorarioID;
    private Date asistenciaFechaHora;
    private float asistenciaPorcentaje;
    private String asistenciaEstado;
    private String cursoNombre; // Para el nombre del curso
    private int asistencias;
    private int faltas;
 private Laboratorio Laboratorio;
    public Asistencia(int asistencias, int faltas) {
        this.asistencias = asistencias;
        this.faltas = faltas;
    }

    public Asistencia(int asistencias, int faltas, Laboratorio Laboratorio) {
        this.asistencias = asistencias;
        this.faltas = faltas;
        this.Laboratorio = Laboratorio;
    }

    public Asistencia(int asistenciaID, int asistenciaAlumnoID, int asistenciaHorarioID, Date asistenciaFechaHora, float asistenciaPorcentaje, String asistenciaEstado, String cursoNombre, int asistencias, int faltas) {
        this.asistenciaID = asistenciaID;
        this.asistenciaAlumnoID = asistenciaAlumnoID;
        this.asistenciaHorarioID = asistenciaHorarioID;
        this.asistenciaFechaHora = asistenciaFechaHora;
        this.asistenciaPorcentaje = asistenciaPorcentaje;
        this.asistenciaEstado = asistenciaEstado;
        this.cursoNombre = cursoNombre;
        this.asistencias = asistencias;
        this.faltas = faltas;
    }

    public Asistencia(int asistenciaID, int asistenciaAlumnoID, int asistenciaHorarioID, Date asistenciaFechaHora, float asistenciaPorcentaje, String asistenciaEstado, String cursoNombre, int asistencias, int faltas, Laboratorio Laboratorio) {
        this.asistenciaID = asistenciaID;
        this.asistenciaAlumnoID = asistenciaAlumnoID;
        this.asistenciaHorarioID = asistenciaHorarioID;
        this.asistenciaFechaHora = asistenciaFechaHora;
        this.asistenciaPorcentaje = asistenciaPorcentaje;
        this.asistenciaEstado = asistenciaEstado;
        this.cursoNombre = cursoNombre;
        this.asistencias = asistencias;
        this.faltas = faltas;
        this.Laboratorio = Laboratorio;
    }

    // Getters y setters aquí

    public int getAsistenciaID() {
        return asistenciaID;
    }

    public void setAsistenciaID(int asistenciaID) {
        this.asistenciaID = asistenciaID;
    }

    public int getAsistenciaAlumnoID() {
        return asistenciaAlumnoID;
    }

    public void setAsistenciaAlumnoID(int asistenciaAlumnoID) {
        this.asistenciaAlumnoID = asistenciaAlumnoID;
    }

    public int getAsistenciaHorarioID() {
        return asistenciaHorarioID;
    }

    public void setAsistenciaHorarioID(int asistenciaHorarioID) {
        this.asistenciaHorarioID = asistenciaHorarioID;
    }

    public Date getAsistenciaFechaHora() {
        return asistenciaFechaHora;
    }

    public void setAsistenciaFechaHora(Date asistenciaFechaHora) {
        this.asistenciaFechaHora = asistenciaFechaHora;
    }

    public float getAsistenciaPorcentaje() {
        return asistenciaPorcentaje;
    }

    public void setAsistenciaPorcentaje(float asistenciaPorcentaje) {
        this.asistenciaPorcentaje = asistenciaPorcentaje;
    }

    public String getAsistenciaEstado() {
        return asistenciaEstado;
    }

    public void setAsistenciaEstado(String asistenciaEstado) {
        this.asistenciaEstado = asistenciaEstado;
    }

    public String getCursoNombre() {
        return cursoNombre;
    }

    public void setCursoNombre(String cursoNombre) {
        this.cursoNombre = cursoNombre;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public Laboratorio getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(Laboratorio Laboratorio) {
        this.Laboratorio = Laboratorio;
    }
    
}
