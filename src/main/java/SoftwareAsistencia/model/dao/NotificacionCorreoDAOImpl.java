package SoftwareAsistencia.model.dao;

import SoftwareAsistencia.model.ConexionSQL;
import SoftwareAsistencia.model.interfaz.NotificacionCorreoDAO;
import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NotificacionCorreoDAOImpl implements NotificacionCorreoDAO {

    @Override
    public void insertarNotificacion(String destinatario, String asunto, String mensaje, 
            int asistenciaID) throws SQLException {
        String storedProc = "{call sp_InsertarNotificacionCorreo(?, ?, ?, ?)}";
        Connection conn = null;
        CallableStatement cstmt = null;

        try {
            conn = ConexionSQL.obtenerConexion();
            cstmt = conn.prepareCall(storedProc);

            cstmt.setString(1, destinatario);
            cstmt.setString(2, asunto);
            cstmt.setString(3, mensaje);
            cstmt.setInt(4, asistenciaID);

            cstmt.execute();
            System.out.println("Notificación guardada en la base de datos");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error al guardar la notificación en la base de datos");
        } finally {
            if (cstmt != null) {
                try {
                    cstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            ConexionSQL.cerrarConexion(conn);
        }
    }

    @Override
    public List<Integer> obtenerTodosLosIdsDeAsistencia() throws SQLException {
        String query = "SELECT Asistencia_ID FROM Asistencia";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Integer> asistenciaIDs = new ArrayList<>();

        try {
            conn = ConexionSQL.obtenerConexion();
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                asistenciaIDs.add(rs.getInt("Asistencia_ID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error al obtener los IDs de asistencia de la base de datos");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            ConexionSQL.cerrarConexion(conn);
        }

        return asistenciaIDs;
    }
}
