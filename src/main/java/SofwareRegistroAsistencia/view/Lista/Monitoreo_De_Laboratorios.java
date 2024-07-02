package SofwareRegistroAsistencia.view.Lista;

import SoftwareAsistencia.model.Laboratorio;
import SoftwareAsistencia.model.LaboratorioService;
import SoftwareAsistencia.model.dao.LaboratorioDAOImpl;
import com.formdev.flatlaf.json.ParseException;
import java.awt.Color;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 
public class Monitoreo_De_Laboratorios extends javax.swing.JFrame {
    public Monitoreo_De_Laboratorios() {
        initComponents();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
//JpanelRound1.setBackground(new Color(0, 0, 0, 90)); //FONDO OSCURO SEMI TRANSPARENTE
//JpanelRound1.setBackground(new Color(255, 255, 255, 85));//fondo tranparente claro
JpanelRound1.setBackground(new Color(0, 0, 0, 150));
this.setLocationRelativeTo(null);
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(new Object[]{
    "Laboratorio Nombre", "Capacidad", "Curso Nombre", "Asistencia %", "Estado Asistencia", "Alumno Nombres", "Alumno Apellidos"
});
jtDatosLab.setModel(model);
//jPanel1.setSize(1110, 630); 
//this.setExtendedState(this.MAXIMIZED_BOTH);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        JpanelRound1 = new Vista.PanelRound();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtDatosLab = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtFin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        txtLAB1 = new javax.swing.JTextField();
        txtInicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filtros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpanelRound1.setRoundBottomLeft(50);
        JpanelRound1.setRoundBottomRight(50);
        JpanelRound1.setRoundTopLeft(50);
        JpanelRound1.setRoundTopRight(50);
        JpanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtDatosLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre LAB", "Curso", "Nombre", "Apellido", "Aforo ", "Asistencias", "Estado"
            }
        ));
        jtDatosLab.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jtDatosLab);

        JpanelRound1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 920, 300));

        btnBuscar.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa (2).jpg"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        JpanelRound1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 30, 30));

        txtFin.setBorder(javax.swing.BorderFactory.createTitledBorder("F. Fin"));
        JpanelRound1.add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 160, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N Lab:");
        JpanelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, 30));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 940, 10));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MONITOREO  DE  LABORATORIOS");
        JpanelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 470, 40));
        JpanelRound1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 90, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Piso:");
        JpanelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 110, 40, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("REPORTE ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JpanelRound1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 140, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 940, 10));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flecha atras.png"))); // NOI18N
        jButton2.setText("VOLVER");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JpanelRound1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, -1, 40));
        JpanelRound1.add(txtLAB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 30));

        txtInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("F.Inicio"));
        JpanelRound1.add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 160, 40));

        jPanel1.add(JpanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1000, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frontis_LosOlivos.tif.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
        // Obtener los valores de los campos de entrada
        String laboratorioNombre = txtLAB1.getText();
        int laboratorioUbicacion = (Integer) jSpinner1.getValue();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Convertir los textos a java.util.Date
        java.util.Date utilDateInicio = dateFormat.parse(txtInicio.getText());
        java.util.Date utilDateFin = dateFormat.parse(txtFin.getText());

        // Convertir java.util.Date a java.sql.Timestamp
        java.sql.Timestamp horarioHoraInicio = new java.sql.Timestamp(utilDateInicio.getTime());
        java.sql.Timestamp horarioHoraFin = new java.sql.Timestamp(utilDateFin.getTime());

        // Crear una instancia del DAO
        LaboratorioDAOImpl laboratorioDAO = new LaboratorioDAOImpl();

        // Llamar al método para obtener los datos del laboratorio
        List<Laboratorio> laboratorios = laboratorioDAO.obtenerDatosLaboratorio(horarioHoraInicio, horarioHoraFin, laboratorioUbicacion, laboratorioNombre);

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = (DefaultTableModel) jtDatosLab.getModel();
        model.setRowCount(0);

        // Procesar los resultados y agregarlos a la tabla
        for (Laboratorio laboratorio : laboratorios) {
            Object[] rowData = new Object[]{
                laboratorio.getLaboratorioNombre(),
                laboratorio.getLaboratorioCapacidad(),
                laboratorio.getCursos().getCursoNombre(),
                laboratorio.getAsistencia().getAsistenciaPorcentaje(),
                laboratorio.getAsistencia().getAsistenciaEstado(),
                laboratorio.getAlumno().getAlumnoNombres(),
                laboratorio.getAlumno().getAlumnoApellidos()
            };
            model.addRow(rowData);
        }

        JOptionPane.showMessageDialog(this, "Búsqueda completada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al buscar los datos del laboratorio", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (ParseException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al parsear las fechas", "Error", JOptionPane.ERROR_MESSAGE);
    }   catch (java.text.ParseException ex) {
            Logger.getLogger(Monitoreo_De_Laboratorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed



    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jfrmAsistencia jfrmAsistencia= new jfrmAsistencia();
jfrmAsistencia.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   LaboratorioService laboratorioService = new LaboratorioService();
        String filePath = "C:\\Users\\ELVIS\\OneDrive\\Documentos\\NetBeansProjects\\SoftwareReconocimientoFacilUCV\\reporte_laboratorio.pdf";
        laboratorioService.generarReporteLaboratorio(filePath);    
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.PanelRound JpanelRound1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jtDatosLab;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtLAB1;
    // End of variables declaration//GEN-END:variables
}
