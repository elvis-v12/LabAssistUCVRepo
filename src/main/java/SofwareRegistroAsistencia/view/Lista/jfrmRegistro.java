package SofwareRegistroAsistencia.view.Lista;

import SoftwareAsistencia.model.ConexionSQL;
import SoftwareAsistencia.Controllers.FaceRecognition;
import javax.swing.JFrame;


public class jfrmRegistro extends javax.swing.JFrame {

        ConexionSQL conexionSQL;

        ConexionSQL cd;

        public jfrmRegistro() {
                initComponents();
                this.setLocationRelativeTo(null);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnFoto1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RECONOCIMIENTO ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 230, 53));

        jLabel9.setFont(new java.awt.Font("Gotham Thin", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 181, 172));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("x");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        btnFoto1.setBackground(new java.awt.Color(73, 181, 172));
        btnFoto1.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnFoto1.setForeground(new java.awt.Color(255, 255, 255));
        btnFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camara-fotografica.png"))); // NOI18N
        btnFoto1.setText("INGRESAR");
        btnFoto1.setBorderPainted(false);
        btnFoto1.setContentAreaFilled(false);
        btnFoto1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFoto1.setFocusPainted(false);
        btnFoto1.setRequestFocusEnabled(false);
        btnFoto1.setVerifyInputWhenFocusTarget(false);
        btnFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoto1ActionPerformed(evt);
            }
        });
        btnFoto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFoto1KeyPressed(evt);
            }
        });
        jPanel2.add(btnFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 230, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PARA ALUMNO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
            System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnFoto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFoto1KeyPressed

    }//GEN-LAST:event_btnFoto1KeyPressed

    private void btnFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoto1ActionPerformed
       FaceRecognition faceRecognition = new FaceRecognition();        
    }//GEN-LAST:event_btnFoto1ActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
