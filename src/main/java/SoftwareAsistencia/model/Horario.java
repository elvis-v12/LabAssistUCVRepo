package SoftwareAsistencia.model;

import java.sql.Date;

public class Horario {
    private int horarioID;
    private int horarioCursoID;
    private int horarioLaboratorioID;
    private String horarioDiaSemana;
    private Date horarioHoraInicio;
    private Date horarioHoraFin;
  private Laboratorio Laboratorio;
    public Horario(int horarioID, int horarioCursoID, int horarioLaboratorioID, String horarioDiaSemana, Date horarioHoraInicio, Date horarioHoraFin) {
        this.horarioID = horarioID;
        this.horarioCursoID = horarioCursoID;
        this.horarioLaboratorioID = horarioLaboratorioID;
        this.horarioDiaSemana = horarioDiaSemana;
        this.horarioHoraInicio = horarioHoraInicio;
        this.horarioHoraFin = horarioHoraFin;
    }

    public Horario(int horarioID, int horarioCursoID, int horarioLaboratorioID, String horarioDiaSemana, Date horarioHoraInicio, Date horarioHoraFin, Laboratorio Laboratorio) {
        this.horarioID = horarioID;
        this.horarioCursoID = horarioCursoID;
        this.horarioLaboratorioID = horarioLaboratorioID;
        this.horarioDiaSemana = horarioDiaSemana;
        this.horarioHoraInicio = horarioHoraInicio;
        this.horarioHoraFin = horarioHoraFin;
        this.Laboratorio = Laboratorio;
    }

    public Laboratorio getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(Laboratorio Laboratorio) {
        this.Laboratorio = Laboratorio;
    }

    public int getHorarioID() {
        return horarioID;
    }

    public void setHorarioID(int horarioID) {
        this.horarioID = horarioID;
    }

    public int getHorarioCursoID() {
        return horarioCursoID;
    }

    public void setHorarioCursoID(int horarioCursoID) {
        this.horarioCursoID = horarioCursoID;
    }

    public int getHorarioLaboratorioID() {
        return horarioLaboratorioID;
    }

    public void setHorarioLaboratorioID(int horarioLaboratorioID) {
        this.horarioLaboratorioID = horarioLaboratorioID;
    }

    public String getHorarioDiaSemana() {
        return horarioDiaSemana;
    }

    public void setHorarioDiaSemana(String horarioDiaSemana) {
        this.horarioDiaSemana = horarioDiaSemana;
    }

    public Date getHorarioHoraInicio() {
        return horarioHoraInicio;
    }

    public void setHorarioHoraInicio(Date horarioHoraInicio) {
        this.horarioHoraInicio = horarioHoraInicio;
    }

    public Date getHorarioHoraFin() {
        return horarioHoraFin;
    }

    public void setHorarioHoraFin(Date horarioHoraFin) {
        this.horarioHoraFin = horarioHoraFin;
    }

    
}