package SoftwareAsistencia.service;

import SoftwareAsistencia.config.ConexionSQL;
import static SoftwareAsistencia.config.ConexionSQL.ConexionSQL;
import SoftwareAsistencia.doa.Dao;
import SoftwareAsistencia.model.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elnoe
 */
public class AlumnoDaoImplement implements Dao<Alumno> {

        private final ConexionSQL ConexionSQL;

        public AlumnoDaoImplement() {
                this.ConexionSQL = ConexionSQL();
        }

        @Override
        public void create(Alumno alumno) {
                try {
                        var sql = "INSERT INTO alumnos(ID_Alumno, nombre, apellido_paterno, apellido_materno) VALUES (?, ?, ?, ?)";
                        var preparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
                        preparedStatement.setInt(1, alumno.getID_Alumno());
                        preparedStatement.setString(2, alumno.getNombre());
                        preparedStatement.setString(3, alumno.getApellido_paterno());
                        preparedStatement.setString(4, alumno.getApellido_materno());
                        preparedStatement.execute();
                } catch (SQLException ex) {
                        Logger.getLogger(AlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        @Override
        public Alumno read(Integer id_alumno) {
                var alumno = new Alumno();
                try {
                        var sql = "SELECT * FROM alumnos WHERE ID_Alumno = ?";
                        var preparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
                        preparedStatement.setInt(1, id_alumno);
                        ResultSet rs = preparedStatement.executeQuery();
                        if (rs.next()) {
                                alumno.setID_Alumno(rs.getInt("ID_Alumno"));
                                alumno.setNombre(rs.getString("nombre"));
                                alumno.setApellido_paterno(rs.getString("apellido_paterno"));
                                alumno.setApellido_materno(rs.getString("apellido_materno"));
                        }
                        return alumno;
                } catch (SQLException ex) {
                        Logger.getLogger(AlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
                return alumno;
        }

        @Override
        public List<Alumno> readAll() {
                var alumnos = new ArrayList<Alumno>();
                try {
                        var sql = "SELECT * FROM alumnos";
                        var preparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
                        var Resulset = preparedStatement.executeQuery();
                        while (Resulset.next()) {
                                Alumno alumno = new Alumno(Resulset.getInt("ID_Alumno"), Resulset.getString("nombre"), Resulset.getString("apellido_paterno"), Resulset.getString("apellido_materno"));
                                alumnos.add(alumno);
                        }
                        return alumnos;
                } catch (SQLException ex) {
                        Logger.getLogger(AlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
                return alumnos;
        }

        @Override
        public Alumno update(Alumno alumno) {
                try {
                        var sql = "UPDATE alumnos SET nombre = ?, apellido_paterno = ?, apellido_materno = ? WHERE ID_Alumno = ?";
                        var preparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
                        preparedStatement.setString(1, alumno.getNombre());
                        preparedStatement.setString(2, alumno.getApellido_paterno());
                        preparedStatement.setString(3, alumno.getApellido_materno());
                        preparedStatement.setInt(4, alumno.getID_Alumno());
                        preparedStatement.execute();
                        return alumno;
                } catch (SQLException ex) {
                        Logger.getLogger(AlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
                return alumno;
        }

        @Override
        public void delete(Integer id_alumno) {
                try {
                        var sql = "DELETE FROM alumnos WHERE ID_Alumno = ?";
                        var preparedStatement = ConexionSQL.getConnection().prepareStatement(sql);
                        preparedStatement.setInt(1, id_alumno);
                        preparedStatement.execute();
                } catch (SQLException ex) {
                        Logger.getLogger(AlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

}
