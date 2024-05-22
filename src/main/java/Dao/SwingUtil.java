package Dao;

import SoftwareAsistencia.model.Asignatura;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static SoftwareAsistencia.util.Data.getString;

/**
 *
 * @author elnoe
 */
public class SwingUtil {

        public static <T> void updateJTableModel(DefaultTableModel model, List<T> objetos) {
                model.setNumRows(0);
                objetos.forEach(
                        data -> model.addRow(getString(data :: toString).split(","))
                );
        }

        public static DefaultTableModel getModel(JTable table) {
                return (DefaultTableModel) table.getModel();
        }

        public static DefaultComboBoxModel getModel(JComboBox comboBox) {
                return (DefaultComboBoxModel) comboBox.getModel();
        }

        public static void updateModelJComboBox(DefaultComboBoxModel model, List<Asignatura> asignaturas) {
                asignaturas.forEach(
                        asignatura -> model.addElement(getString(asignatura :: getNombre))
                );
        }

}
