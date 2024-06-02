package SofwareRegistroAsistencia.view.Lista;

import SoftwareAsistencia.Controllers.FaceRecognition;

/**
 *
 * @author elnoe
 */
public class jfrmAsistencia extends javax.swing.JFrame {


    public jfrmAsistencia() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Estado = new javax.swing.ButtonGroup();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblAlumnosRegistrar = new javax.swing.JTable();
        jbtnGrabarAsistenciaAlumno = new javax.swing.JButton();
        jbtnGrabarAsistencia = new javax.swing.JButton();
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
        jcbxCurso = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        btnfoto = new javax.swing.JButton();

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

        jtblAlumnosRegistrar.setBackground(new java.awt.Color(255, 77, 94));
        jtblAlumnosRegistrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDAlumno", "Alumno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtblAlumnosRegistrar);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 339, 239));

        jbtnGrabarAsistenciaAlumno.setBackground(new java.awt.Color(152, 201, 167));
        jbtnGrabarAsistenciaAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/disco-flexible.png"))); // NOI18N
        jbtnGrabarAsistenciaAlumno.setText("GRABAR ASISTENCIA ALUMNO");
        jbtnGrabarAsistenciaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarAsistenciaAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGrabarAsistenciaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 442, -1, 46));

        jbtnGrabarAsistencia.setBackground(new java.awt.Color(152, 201, 167));
        jbtnGrabarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/disco-flexible.png"))); // NOI18N
        jbtnGrabarAsistencia.setText("Grabar Asistencia");
        jbtnGrabarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarAsistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGrabarAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 750, 60));

        jtxtAlumnoApellidoPaterno.setEditable(false);
        getContentPane().add(jtxtAlumnoApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 278, 200, -1));

        jLabel1.setText("ID Alumno:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 214, 123, 26));

        jtxtAlumnoID.setEditable(false);
        getContentPane().add(jtxtAlumnoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 214, 200, -1));

        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 246, 123, 26));

        jtxtAlumnoNombres.setEditable(false);
        getContentPane().add(jtxtAlumnoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 246, 200, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 6, 1208, 152));

        jtxtAlumnoApellidoMaterno.setEditable(false);
        getContentPane().add(jtxtAlumnoApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 200, -1));

        jLabel4.setText("Apellido Materno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 309, 123, 26));

        jcbxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxCursoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 186, 200, 57));

        Estado.add(jCheckBox1);
        jCheckBox1.setText("Asistencia");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 376, -1, -1));

        jLabel5.setText("Asignaturas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 77, -1));

        btnfoto.setBackground(new java.awt.Color(73, 181, 172));
        btnfoto.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnfoto.setForeground(new java.awt.Color(0, 153, 204));
        btnfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/camara-fotografica.png"))); // NOI18N
        btnfoto.setText("Foto");
        btnfoto.setBorderPainted(false);
        btnfoto.setContentAreaFilled(false);
        btnfoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnfoto.setFocusPainted(false);
        btnfoto.setRequestFocusEnabled(false);
        btnfoto.setVerifyInputWhenFocusTarget(false);
        btnfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfotoActionPerformed(evt);
            }
        });
        btnfoto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnfotoKeyPressed(evt);
            }
        });
        getContentPane().add(btnfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 130, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void jbtnGrabarAsistenciaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarAsistenciaAlumnoActionPerformed
           
        }//GEN-LAST:event_jbtnGrabarAsistenciaAlumnoActionPerformed

        private void jbtnGrabarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarAsistenciaActionPerformed

        }//GEN-LAST:event_jbtnGrabarAsistenciaActionPerformed

        private void btnfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfotoActionPerformed
            FaceRecognition faceRecognition = new FaceRecognition();

        }//GEN-LAST:event_btnfotoActionPerformed

        private void btnfotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnfotoKeyPressed

        }//GEN-LAST:event_btnfotoKeyPressed

        private void jcbxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxCursoActionPerformed
            
        }//GEN-LAST:event_jcbxCursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JButton btnfoto;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnGrabarAsistencia;
    private javax.swing.JButton jbtnGrabarAsistenciaAlumno;
    private javax.swing.JComboBox<String> jcbxCurso;
    private javax.swing.JTable jtblAlumnosRegistrar;
    private javax.swing.JTextField jtxtAlumnoApellidoMaterno;
    private javax.swing.JTextField jtxtAlumnoApellidoPaterno;
    private javax.swing.JTextField jtxtAlumnoID;
    private javax.swing.JTextField jtxtAlumnoNombres;
    // End of variables declaration//GEN-END:variables
}
