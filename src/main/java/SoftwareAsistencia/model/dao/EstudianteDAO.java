package SoftwareAsistencia.model.dao;

import SoftwareAsistencia.model.ConexionSQL;
import SoftwareAsistencia.model.Estudiante;
import SoftwareAsistencia.model.interfaz.FiltroAlumnos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO implements FiltroAlumnos {

    @Override
    public List<Estudiante> buscarEstudiantes(Integer codigo, Integer ciclo, String carrera, String curso, 
            Date fechaIngreso, Date fechaSalida) throws Exception {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "EXEC sp_BusquedaEstudiantes ?, ?, ?, ?, ?, ?";
        try (Connection conn = ConexionSQL.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            if (codigo == null) {
                stmt.setNull(1, Types.INTEGER);
            } else {
                stmt.setInt(1, codigo);
            }
            if (ciclo == null) {
                stmt.setNull(2, Types.INTEGER);
            } else {
                stmt.setInt(2, ciclo);
            }
            stmt.setString(3, carrera);
            stmt.setString(4, curso);
            stmt.setDate(5, fechaIngreso);
            stmt.setDate(6, fechaSalida);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                        rs.getInt("Código"),
                        rs.getString("Nombres"),
                        rs.getString("Apellidos"),
                        rs.getString("Correo"),
                        rs.getString("Curso"),
                        rs.getString("Carrera"),
                        rs.getFloat("Asistencias"),
                        rs.getString("Faltas"),
                        rs.getString("Ciclo")
                );
                estudiantes.add(estudiante);
            }
        }

        return estudiantes;
    }
}
