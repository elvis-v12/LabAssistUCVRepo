/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SoftwareAsistencia.model.interfaz;

import java.sql.Date;
import java.util.List;
import SoftwareAsistencia.model.Estudiante;

public interface FiltroAlumnos {
    List<Estudiante> buscarEstudiantes(Integer codigo, Integer ciclo, String carrera, String curso, Date fechaIngreso, Date fechaSalida) throws Exception;
}
