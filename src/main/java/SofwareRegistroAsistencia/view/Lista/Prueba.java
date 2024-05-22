package SofwareRegistroAsistencia.view.Lista;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightIJTheme;
import java.awt.Color;
 
public class Prueba extends javax.swing.JFrame {
 
    public Prueba() {
        initComponents();
        
//JpanelRound1.setBackground(new Color(0, 0, 0, 90)); //FONDO OSCURO SEMI TRANSPARENTE
//JpanelRound1.setBackground(new Color(255, 255, 255, 85));//fondo tranparente claro
JpanelRound1.setBackground(new Color(0, 0, 0, 150));
this.setLocationRelativeTo(null);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        JpanelRound1 = new Vista.PanelRound();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filtros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpanelRound1.setRoundBottomLeft(50);
        JpanelRound1.setRoundBottomRight(50);
        JpanelRound1.setRoundTopLeft(50);
        JpanelRound1.setRoundTopRight(50);
        JpanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Nombres", "Apellidos", "Correo", "Curso", "Carrera", "Total Asistencias", "Faltas", "Ciclo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jTable3);

        JpanelRound1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 870, 160));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 940, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 940, 10));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Nombres", "Apellidos", "Correo", "Carrera", "Asistencias", "Ciclo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setColumnSelectionAllowed(true);
        jScrollPane4.setViewportView(jTable4);

        JpanelRound1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 870, 160));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha Salida:");
        JpanelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código:");
        JpanelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));
        JpanelRound1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 220, 30));
        JpanelRound1.add(jDateChooser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 150, 30));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        JpanelRound1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 120, 30));
        JpanelRound1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 210, 30));
        JpanelRound1.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 150, 30));
        JpanelRound1.add(jDateChooser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 150, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        jButton2.setText("BUSCAR");
        JpanelRound1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 110, 30));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ANÁLISIS DE ASISTENCIAS");
        JpanelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 300, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Código:");
        JpanelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carrera");
        JpanelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha Ingreso:");
        JpanelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha Salida:");
        JpanelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 940, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 940, 10));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ANÁLISIS DE ASISTENCIAS");
        JpanelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 300, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JpanelRound1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 150, 30));

        getContentPane().add(JpanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 990, 610));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frontis_LosOlivos.tif.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1340, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.PanelRound JpanelRound1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
