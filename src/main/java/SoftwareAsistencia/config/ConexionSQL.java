package SoftwareAsistencia.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

        private static ConexionSQL conexionSQL = null;

        private String url = "jdbc:mysql://localhost:3306/registrosalumnos";

        private String usuario = "root";

        private String contraseña = "";

        private Connection conexion = null;

        public ConexionSQL() {

                try {
                        // Establecer la conexión a la base de datos
                        conexion = DriverManager.getConnection(url, usuario, contraseña);

                        if (conexion != null) {
                                System.out.println("Conexión exitosa a la base de datos.");
                                // No cierres la conexión aquí
                        } else {
                                System.err.println("La conexión a la base de datos ha fallado.");
                        }
                } catch (SQLException e) {
                        System.err.println("Error de conexión: " + e.getMessage());
                }
        }

        public static ConexionSQL ConexionSQL() {
                if (conexionSQL == null) {
                        conexionSQL = new ConexionSQL();
                }
                return conexionSQL;
        }

        public Connection getConnection() {
                return conexion;
        }

}
