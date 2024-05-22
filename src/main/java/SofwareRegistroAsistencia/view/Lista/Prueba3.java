package SofwareRegistroAsistencia.view.Lista;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightIJTheme;
import java.awt.Color;
 
public class Prueba3 extends javax.swing.JFrame {
 
    public Prueba3() {
        initComponents();
        
//JpanelRound1.setBackground(new Color(0, 0, 0, 90)); //FONDO OSCURO SEMI TRANSPARENTE
//JpanelRound1.setBackground(new Color(255, 255, 255, 85));//fondo tranparente claro
JpanelRound1.setBackground(new Color(0, 0, 0, 150));
this.setLocationRelativeTo(null);

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
        jTable3 = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jSeparator5 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
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

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N° Lab", "Curso", "Estudiante", "Aforo ", "Asistencias", "Faltas"
            }
        ));
        jTable3.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jTable3);

        JpanelRound1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 920, 300));

        btnBuscar.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa (2).jpg"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        JpanelRound1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 30, 30));
        JpanelRound1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 30));
        JpanelRound1.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 160, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N° Lab:");
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
        JpanelRound1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 140, 30));
        JpanelRound1.add(jDateChooser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 160, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        JpanelRound1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 940, 10));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton2.setText("VOLVER");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JpanelRound1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, -1, 40));

        jPanel1.add(JpanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1000, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Frontis_LosOlivos.tif.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Flecha atras.png"))); // NOI18N
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.PanelRound JpanelRound1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser9;
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
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
