package SoftwareAsistencia.model;
public class Laboratorio {
    private int laboratorioID;
    private String laboratorioNombre;
    private int laboratorioUbicacion;
    private int laboratorioCapacidad;

    public Laboratorio(int laboratorioID, String laboratorioNombre, int laboratorioUbicacion, int laboratorioCapacidad) {
        this.laboratorioID = laboratorioID;
        this.laboratorioNombre = laboratorioNombre;
        this.laboratorioUbicacion = laboratorioUbicacion;
        this.laboratorioCapacidad = laboratorioCapacidad;
    }

    public int getLaboratorioID() {
        return laboratorioID;
    }

    public void setLaboratorioID(int laboratorioID) {
        this.laboratorioID = laboratorioID;
    }

    public String getLaboratorioNombre() {
        return laboratorioNombre;
    }

    public void setLaboratorioNombre(String laboratorioNombre) {
        this.laboratorioNombre = laboratorioNombre;
    }

    public int getLaboratorioUbicacion() {
        return laboratorioUbicacion;
    }

    public void setLaboratorioUbicacion(int laboratorioUbicacion) {
        this.laboratorioUbicacion = laboratorioUbicacion;
    }

    public int getLaboratorioCapacidad() {
        return laboratorioCapacidad;
    }

    public void setLaboratorioCapacidad(int laboratorioCapacidad) {
        this.laboratorioCapacidad = laboratorioCapacidad;
    }

    
}