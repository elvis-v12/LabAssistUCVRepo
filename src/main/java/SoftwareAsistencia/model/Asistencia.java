package SoftwareAsistencia.model;

import java.sql.Date;

public class Asistencia {
    private int asistenciaID;
    private int asistenciaAlumnoID;
    private int asistenciaHorarioID;
    private Date asistenciaFechaHora;
    private float asistenciaPorcentaje;
    private String asistenciaEstado;

    public Asistencia(int asistenciaID, int asistenciaAlumnoID, int asistenciaHorarioID, Date asistenciaFechaHora, float asistenciaPorcentaje, String asistenciaEstado) {
        this.asistenciaID = asistenciaID;
        this.asistenciaAlumnoID = asistenciaAlumnoID;
        this.asistenciaHorarioID = asistenciaHorarioID;
        this.asistenciaFechaHora = asistenciaFechaHora;
        this.asistenciaPorcentaje = asistenciaPorcentaje;
        this.asistenciaEstado = asistenciaEstado;
    }

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

    
}