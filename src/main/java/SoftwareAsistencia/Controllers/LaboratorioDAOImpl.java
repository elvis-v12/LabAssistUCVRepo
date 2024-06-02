package SoftwareAsistencia.Controllers;
import SoftwareAsistencia.model.Laboratorio;
import SoftwareAsistencia.model.interfaz.LaboratorioDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaboratorioDAOImpl implements LaboratorioDAO {
    private Connection connection;

    public LaboratorioDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Laboratorio getLaboratorioById(int id) {
        String query = "SELECT * FROM Laboratorio WHERE Laboratorio_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Laboratorio(
                    rs.getInt("Laboratorio_ID"),
                    rs.getString("Laboratorio_Nombre"),
                    rs.getInt("Laboratorio_Ubicacion"),
                    rs.getInt("Laboratorio_Capacidad")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Laboratorio> getAllLaboratorios() {
        List<Laboratorio> laboratorios = new ArrayList<>();
        String query = "SELECT * FROM Laboratorio";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                laboratorios.add(new Laboratorio(
                    rs.getInt("Laboratorio_ID"),
                    rs.getString("Laboratorio_Nombre"),
                    rs.getInt("Laboratorio_Ubicacion"),
                    rs.getInt("Laboratorio_Capacidad")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return laboratorios;
    }

    @Override
    public void addLaboratorio(Laboratorio laboratorio) {
        String query = "INSERT INTO Laboratorio (Laboratorio_Nombre, Laboratorio_Ubicacion, Laboratorio_Capacidad) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, laboratorio.getLaboratorioNombre());
            stmt.setInt(2, laboratorio.getLaboratorioUbicacion());
            stmt.setInt(3, laboratorio.getLaboratorioCapacidad());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateLaboratorio(Laboratorio laboratorio) {
        String query = "UPDATE Laboratorio SET Laboratorio_Nombre = ?, Laboratorio_Ubicacion = ?, Laboratorio_Capacidad = ? WHERE Laboratorio_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, laboratorio.getLaboratorioNombre());
            stmt.setInt(2, laboratorio.getLaboratorioUbicacion());
            stmt.setInt(3, laboratorio.getLaboratorioCapacidad());
            stmt.setInt(4, laboratorio.getLaboratorioID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteLaboratorio(int id) {
        String query = "DELETE FROM Laboratorio WHERE Laboratorio_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
