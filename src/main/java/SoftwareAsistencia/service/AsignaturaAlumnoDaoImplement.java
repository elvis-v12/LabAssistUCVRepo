package SoftwareAsistencia.service;

import SoftwareAsistencia.config.ConexionSQL;
import static SoftwareAsistencia.config.ConexionSQL.ConexionSQL;
import SoftwareAsistencia.doa.Dao;
import SoftwareAsistencia.model.AsignaturaAlumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elnoe
 */
public class AsignaturaAlumnoDaoImplement implements Dao<AsignaturaAlumno> {

        private final ConexionSQL ConexionSQL;

        public AsignaturaAlumnoDaoImplement() {
                this.ConexionSQL = ConexionSQL();
        }

        @Override
        public void create(AsignaturaAlumno asignaturaAlumno) {
                try {
                        String query = "INSERT INTO alumnoasignatura(ID_AlumnoAsignatura, ID_Alumno, ID_Asignatura) VALUES (?, ?, ?)";
                        PreparedStatement stmt = ConexionSQL.getConnection().prepareStatement(query);
                        stmt.setInt(1, asignaturaAlumno.getID_AlumnoAsignatura());
                        stmt.setInt(2, asignaturaAlumno.getID_Alumno());
                        stmt.setInt(3, asignaturaAlumno.getID_Asignatura());
                        stmt.execute();
                } catch (SQLException ex) {
                        Logger.getLogger(AsignaturaAlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        @Override
        public AsignaturaAlumno read(Integer id_alumno_asignatura) {
                AsignaturaAlumno asignaturaAlumno = null;
                try {
                        String query = "SELECT * FROM alumnoasignatura WHERE ID_AlumnoAsignatura = ?";
                        PreparedStatement stmt = ConexionSQL.getConnection().prepareStatement(query);
                        stmt.setInt(1, id_alumno_asignatura);
                        ResultSet rs = stmt.executeQuery();

                        if (rs.next()) {
                                asignaturaAlumno = new AsignaturaAlumno(rs.getInt("ID_AlumnoAsignatura"), rs.getInt("ID_Alumno"), rs.getInt("ID_Asignatura"));
                        }
                        return asignaturaAlumno;
                } catch (SQLException ex) {
                        Logger.getLogger(AsignaturaAlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
                return asignaturaAlumno;
        }

        @Override
        public List<AsignaturaAlumno> readAll() {
                var asignaturasAlumnos = new ArrayList<AsignaturaAlumno>();
                try {
                        String query = "SELECT * FROM alumnoasignatura";
                        PreparedStatement stmt = ConexionSQL.getConnection().prepareStatement(query);
                        ResultSet rs = stmt.executeQuery();

                        while (rs.next()) {
                                AsignaturaAlumno asignaturaAlumno = new AsignaturaAlumno(rs.getInt("ID_AlumnoAsignatura"), rs.getInt("ID_Alumno"), rs.getInt("ID_Asignatura"));
                                asignaturasAlumnos.add(asignaturaAlumno);
                        }
                        return asignaturasAlumnos;
                } catch (SQLException ex) {
                        Logger.getLogger(AsignaturaAlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
                return asignaturasAlumnos;
        }

        @Override
        public AsignaturaAlumno update(AsignaturaAlumno asignaturaAlumno) {
                try {
                        String query = "UPDATE alumnoasignatura SET ID_Alumno = ?, ID_Asignatura = ? WHERE ID_AlumnoAsignatura = ?";
                        PreparedStatement stmt = ConexionSQL.getConnection().prepareStatement(query);
                        stmt.setInt(1, asignaturaAlumno.getID_Alumno());
                        stmt.setInt(2, asignaturaAlumno.getID_Asignatura());
                        stmt.setInt(3, asignaturaAlumno.getID_AlumnoAsignatura());
                        stmt.execute();
                        return asignaturaAlumno;
                } catch (SQLException ex) {
                        Logger.getLogger(AsignaturaAlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
                return asignaturaAlumno;
        }

        @Override
        public void delete(Integer id_alumno_asignatura) {
                try {
                        String query = "DELETE FROM alumnoasignatura WHERE ID_AlumnoAsignatura = ?";
                        PreparedStatement stmt = ConexionSQL.getConnection().prepareStatement(query);
                        stmt.setInt(1, id_alumno_asignatura);
                        stmt.execute();
                } catch (SQLException ex) {
                        Logger.getLogger(AsignaturaAlumnoDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

}
