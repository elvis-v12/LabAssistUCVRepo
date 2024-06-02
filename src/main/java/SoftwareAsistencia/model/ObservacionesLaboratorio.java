package SoftwareAsistencia.model;

import java.sql.Date;

public class ObservacionesLaboratorio {
    private int observacionID;
    private int horarioID;
    private Date fechaObservacion;
    private String observacion;

    public ObservacionesLaboratorio(int observacionID, int horarioID, Date fechaObservacion, String observacion) {
        this.observacionID = observacionID;
        this.horarioID = horarioID;
        this.fechaObservacion = fechaObservacion;
        this.observacion = observacion;
    }

    public int getObservacionID() {
        return observacionID;
    }

    public void setObservacionID(int observacionID) {
        this.observacionID = observacionID;
    }

    public int getHorarioID() {
        return horarioID;
    }

    public void setHorarioID(int horarioID) {
        this.horarioID = horarioID;
    }

    public Date getFechaObservacion() {
        return fechaObservacion;
    }

    public void setFechaObservacion(Date fechaObservacion) {
        this.fechaObservacion = fechaObservacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
}