package SoftwareAsistencia.service;

import SoftwareAsistencia.model.Asignatura;
import SoftwareAsistencia.config.ConexionSQL;
import static SoftwareAsistencia.config.ConexionSQL.ConexionSQL;
import SoftwareAsistencia.doa.Dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AsignaturaDaoImplement implements Dao<Asignatura> {

        private final ConexionSQL ConexionSQL;

        public AsignaturaDaoImplement() {
                this.ConexionSQL = ConexionSQL();
        }

        @Override
        public void create(Asignatura asignatura) {
                try {
                        String sql = "INSERT INTO asignaturas (nombre) VALUES ( ?)";
                        PreparedStatement preparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
                        preparedStatement.setString(1, asignatura.getNombre());

                        int filasAfectadas = preparedStatement.executeUpdate();

                        if (filasAfectadas > 0) {
                                System.out.println("Curso guardado exitosamente");
                        } else {
                                System.out.println("No se pudo guardar el curso");
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

        @Override
        public Asignatura read(Integer Id_asignatura) {
                Asignatura asignatura = null;
                try {
                        var sql = "SELECT * FROM asignaturas WHERE Id_asignatura = (?)";
                        var PreparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
                        PreparedStatement.setInt(1, Id_asignatura);
                        var Resultset = PreparedStatement.executeQuery();
                        asignatura = new Asignatura(Resultset.getInt("Id_asignatura"), Resultset.getString("nombre"));
                } catch (SQLException e) {
                }
                return asignatura;
        }

        @Override
        public List<Asignatura> readAll() {
                var asignaturas = new ArrayList<Asignatura>();
                try {
                        var sql = "SELECT * FROM asignaturas;";
                        var PreparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
                        var Resulset = PreparedStatement.executeQuery();
                        while (Resulset.next()) {
                                var id = Resulset.getInt("Id_asignatura");
                                var nombre = Resulset.getString("nombre");
                                asignaturas.add(new Asignatura(id, nombre));
                        }
                } catch (Exception e) {
                        System.err.println(e);
                }
                return asignaturas;

        }

        @Override
        public Asignatura update(Asignatura asignatura) {
                return null;
        }

        @Override
        public void delete(Integer id) {

        }

}
