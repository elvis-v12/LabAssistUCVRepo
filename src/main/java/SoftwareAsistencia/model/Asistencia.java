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
    private Laboratorio laboratorio;

    // Constructor for use in Alumno
    public Asistencia(float asistenciaPorcentaje, String asistenciaEstado) {
        this.asistenciaPorcentaje = asistenciaPorcentaje;
        this.asistenciaEstado = asistenciaEstado;
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
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}
