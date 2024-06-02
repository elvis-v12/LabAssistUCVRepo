package SofwareRegistroAsistencia.view.Lista;

import SoftwareAsistencia.Controllers.AsistenciDAOImpl;
import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.ConexionSQL;
import SoftwareAsistencia.model.ReporteService;
import SoftwareAsistencia.model.interfaz.AsistenciaDAO;
import Vista.PanelRound;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 
public class Asistencia_Estudiantes extends javax.swing.JFrame {

    
    
    
    public Asistencia_Estudiantes() {
         initComponents();
   // Inicialización de componentes
        JpanelRound1 = new PanelRound();
        jPanel1 = new JPanel();

        // Configuraciones del JpanelRound1
        JpanelRound1.setRoundTopLeft(50);
        JpanelRound1.setRoundTopRight(50);
        JpanelRound1.setRoundBottomLeft(50);
        JpanelRound1.setRoundBottomRight(50);
        JpanelRound1.setBackground(new Color(0, 0, 0, 150));

        // Configuraciones del JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(1108, 633);
        this.setLayout(new BorderLayout());

        // Añadir JpanelRound1 al JFrame
        this.add(JpanelRound1, BorderLayout.CENTER);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        JpanelRound1 = new Vista.PanelRound();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtDATOS = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnGenerarInforme = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filtros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpanelRound1.setRoundBottomLeft(50);
        JpanelRound1.setRoundBottomRight(50);
        JpanelRound1.setRoundTopLeft(50);
        JpanelRound1.setRoundTopRight(50);
        JpanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtDATOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombres", "Apellidos", "Correo", "Curso", "Carrera", "Asistencias", "Faltas", "Ciclo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtDATOS.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jtDATOS);
        jtDATOS.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        JpanelRound1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 650, 340));

        btnBuscar.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa (2).jpg"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        JpanelRound1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 30, 30));
        JpanelRound1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 180, 30));
        JpanelRound1.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 210, 30));
        JpanelRound1.add(jDateChooser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 210, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Código:");
        JpanelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("F. Ingreso:");
        JpanelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("F. Salida:");
        JpanelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 940, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 940, 10));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MONITOREO  DE  ASISTENCIA  A  ESTUDIANTES");
        JpanelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 610, 40));

        JpanelRound1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 210, 30));
        JpanelRound1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 210, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ciclo:");
        JpanelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        JpanelRound1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 210, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Carrera:");
        JpanelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Curso:");
        JpanelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jButton4.setText("VOLVER");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        JpanelRound1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, -1, 30));

        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jButton5.setText("REPORTAR INCIDENCIA");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        JpanelRound1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, 30));

        btnGenerarInforme.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        btnGenerarInforme.setText("INFORME");
        btnGenerarInforme.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarInformeActionPerformed(evt);
            }
        });
        JpanelRound1.add(btnGenerarInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, 30));

        getContentPane().add(JpanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1010, 520));

        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frontis_LosOlivos.tif.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, -1));

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton3.setText("VOLVER");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      try {
        // Obtener el ID del alumno ingresado
        int alumnoCodigo = Integer.parseInt(txtCodigo.getText());

        // Obtener la conexión y el DAO
        ConexionSQL conexionSQL = new ConexionSQL();
        AsistenciaDAO asistenciaDAO = new AsistenciDAOImpl(conexionSQL);

        // Buscar alumnos por ID
        List<Alumno> alumnos = asistenciaDAO.obtenerAlumnosConAsistencias(alumnoCodigo);

        // Actualizar la tabla con los datos obtenidos
        actualizarTabla(alumnos);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed
private void actualizarTabla(List<Alumno> alumnos) {
    String[] columnas = {"Código", "Nombres", "Apellidos", "Email", "Carrera", "Curso", "Asistencias", "Faltas"};
    Object[][] datos = new Object[alumnos.size()][8];

    for (int i = 0; i < alumnos.size(); i++) {
        Alumno alumno = alumnos.get(i);
        datos[i][0] = alumno.getAlumnoCodigo();
        datos[i][1] = alumno.getAlumnoNombres();
        datos[i][2] = alumno.getAlumnoApellidos();
        datos[i][3] = alumno.getAlumnoEmail();
        datos[i][4] = alumno.getAlumnoCarreraProfesional();
        datos[i][5] = alumno.getAsistencia().getCursoNombre();
        datos[i][6] = alumno.getAsistencia().getAsistencias();
        datos[i][7] = alumno.getAsistencia().getFaltas();
    }

    jtDATOS.setModel(new javax.swing.table.DefaultTableModel(datos, columnas));
}


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        jfrmAsistencia jfrmAsistencia=new jfrmAsistencia();
        jfrmAsistencia.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ReporteInsidiencias ReporteInsidiencias= new ReporteInsidiencias();
       ReporteInsidiencias.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnGenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarInformeActionPerformed
      try {
        // Obtener el ID del alumno ingresado
        int alumnoCodigo = Integer.parseInt(txtCodigo.getText());

        // Obtener la conexión y el DAO
        ConexionSQL conexionSQL = new ConexionSQL();
        AsistenciaDAO asistenciaDAO = new AsistenciDAOImpl(conexionSQL);

        // Buscar alumnos por ID
        List<Alumno> alumnos = asistenciaDAO.obtenerAlumnosConAsistencias(alumnoCodigo);

        // Generar el reporte en PDF
        String filePath = "reporte_asistencia.pdf";
        ReporteService.generarReporteAsistencia(filePath, alumnos);

        JOptionPane.showMessageDialog(this, "Reporte generado en: " + filePath, "Reporte Generado", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Ocurrió un error al generar el reporte.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGenerarInformeActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.PanelRound JpanelRound1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarInforme;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jtDATOS;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
