package SofwareRegistroAsistencia.view.Lista;

import SoftwareAsistencia.Controllers.FaceRecognition;
import javax.swing.JFrame;

/**
 *
 * @author elnoe
 */
public class jfrmAsistencia extends javax.swing.JFrame {


    public jfrmAsistencia() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Estado = new javax.swing.ButtonGroup();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jbtnGrabarAsistenciaAlumno = new javax.swing.JButton();
        jtxtAlumnoApellidoPaterno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtAlumnoID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtAlumnoNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtAlumnoApellidoMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnQR = new javax.swing.JButton();
        btnJustificar = new javax.swing.JButton();
        jbtnGrabarAsistenciaAlumno2 = new javax.swing.JButton();
        btnFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMULARIO ASISTENCIA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Estado.add(jCheckBox2);
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Falta");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 376, -1, -1));

        Estado.add(jCheckBox3);
        jCheckBox3.setText("Justificación");
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 376, -1, -1));

        jbtnGrabarAsistenciaAlumno.setBackground(new java.awt.Color(152, 201, 167));
        jbtnGrabarAsistenciaAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
        jbtnGrabarAsistenciaAlumno.setText("ASISTENCIA DE ESTUDINATES");
        jbtnGrabarAsistenciaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarAsistenciaAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGrabarAsistenciaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, -1, 46));

        jtxtAlumnoApellidoPaterno.setEditable(false);
        getContentPane().add(jtxtAlumnoApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 278, 200, -1));

        jLabel1.setText("ID Alumno:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 214, 123, 26));

        jtxtAlumnoID.setEditable(false);
        getContentPane().add(jtxtAlumnoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 214, 200, -1));

        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 246, 123, 26));

        jtxtAlumnoNombres.setEditable(false);
        getContentPane().add(jtxtAlumnoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 238, 200, 30));

        jLabel3.setText("Apellido Paterno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 278, 123, 26));

        jTable1.setBackground(new java.awt.Color(255, 77, 94));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDAlumno", "Alumno", "Fecha", "Asignatura", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 6, 1260, 152));

        jtxtAlumnoApellidoMaterno.setEditable(false);
        getContentPane().add(jtxtAlumnoApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 200, -1));

        jLabel4.setText("Apellido Materno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 309, 123, 26));

        Estado.add(jCheckBox1);
        jCheckBox1.setText("Asistencia");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 376, -1, -1));

        btnQR.setBackground(new java.awt.Color(73, 181, 172));
        btnQR.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnQR.setForeground(new java.awt.Color(0, 153, 204));
        btnQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camara-fotografica.png"))); // NOI18N
        btnQR.setText("Generar QR");
        btnQR.setBorderPainted(false);
        btnQR.setContentAreaFilled(false);
        btnQR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnQR.setFocusPainted(false);
        btnQR.setRequestFocusEnabled(false);
        btnQR.setVerifyInputWhenFocusTarget(false);
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });
        btnQR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnQRKeyPressed(evt);
            }
        });
        getContentPane().add(btnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 270, 180, 60));

        btnJustificar.setBackground(new java.awt.Color(152, 201, 167));
        btnJustificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-flexible.png"))); // NOI18N
        btnJustificar.setText("GRABAR REGISTRO ALUMNO");
        btnJustificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJustificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJustificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, 46));

        jbtnGrabarAsistenciaAlumno2.setBackground(new java.awt.Color(152, 201, 167));
        jbtnGrabarAsistenciaAlumno2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrador.png"))); // NOI18N
        jbtnGrabarAsistenciaAlumno2.setText("LABORATORIOS");
        jbtnGrabarAsistenciaAlumno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarAsistenciaAlumno2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGrabarAsistenciaAlumno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 180, 46));

        btnFoto.setBackground(new java.awt.Color(73, 181, 172));
        btnFoto.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(0, 153, 204));
        btnFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camara-fotografica.png"))); // NOI18N
        btnFoto.setText("Foto");
        btnFoto.setBorderPainted(false);
        btnFoto.setContentAreaFilled(false);
        btnFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFoto.setFocusPainted(false);
        btnFoto.setRequestFocusEnabled(false);
        btnFoto.setVerifyInputWhenFocusTarget(false);
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        btnFoto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFotoKeyPressed(evt);
            }
        });
        getContentPane().add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 130, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void jbtnGrabarAsistenciaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarAsistenciaAlumnoActionPerformed
        Asistencia_Estudiantes Asistencia_Estudiantes=new Asistencia_Estudiantes();  
        Asistencia_Estudiantes.setVisible(true);
        }//GEN-LAST:event_jbtnGrabarAsistenciaAlumnoActionPerformed

        private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
        QR_UCVGenerator QR_UCVGenerator = new QR_UCVGenerator();
        QR_UCVGenerator.setVisible(true);
        
        }//GEN-LAST:event_btnQRActionPerformed

        private void btnQRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnQRKeyPressed

        }//GEN-LAST:event_btnQRKeyPressed

    private void btnJustificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJustificarActionPerformed

    }//GEN-LAST:event_btnJustificarActionPerformed

    private void jbtnGrabarAsistenciaAlumno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarAsistenciaAlumno2ActionPerformed
       Monitoreo_De_Laboratorios Monitoreo_De_Laboratorios= new Monitoreo_De_Laboratorios();
       Monitoreo_De_Laboratorios.setVisible(true);
    }//GEN-LAST:event_jbtnGrabarAsistenciaAlumno2ActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
      FaceRecognition faceRecognition = new FaceRecognition();
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnFotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFotoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFotoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnJustificar;
    private javax.swing.JButton btnQR;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnGrabarAsistenciaAlumno;
    private javax.swing.JButton jbtnGrabarAsistenciaAlumno2;
    private javax.swing.JTextField jtxtAlumnoApellidoMaterno;
    private javax.swing.JTextField jtxtAlumnoApellidoPaterno;
    private javax.swing.JTextField jtxtAlumnoID;
    private javax.swing.JTextField jtxtAlumnoNombres;
    // End of variables declaration//GEN-END:variables
}
