package SofwareRegistroAsistencia.view.Lista;

import SoftwareAsistencia.Controllers.FaceRecognition;
import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.dao.AlumnoDAOImpl;
import SoftwareAsistencia.model.interfaz.AlumnoDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elvis
 */
public class jfrmAsistencia extends javax.swing.JFrame {
 private DefaultTableModel modelo;

    public jfrmAsistencia() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
private void mostrarAlumnosEnTabla(List<Alumno> alumnos) {
    String[] columnNames = {"Código", "Nombres", "Apellidos", "Email", "QR", "Imagen Rostro", "Carrera Profesional", "Estado", "Alumno_Cdg"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    for (Alumno alumno : alumnos) {
        Object[] rowData = {
            alumno.getAlumnoCodigo(),
            alumno.getAlumnoNombres(),
            alumno.getAlumnoApellidos(),
            alumno.getAlumnoEmail(),
            alumno.getAlumnoQR(),
            alumno.getAlumnoImagenRostro(),
            alumno.getAlumnoCarreraProfesional(),
            alumno.getAlumnoEstado(),
            alumno.getAlumnoCdg()
        };
        model.addRow(rowData);
    }

    tbDatos.setModel(model);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Estado = new javax.swing.ButtonGroup();
        jbtnGrabarAsistenciaAlumno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnQR = new javax.swing.JButton();
        jbtnGrabarAsistenciaAlumno2 = new javax.swing.JButton();
        btnFoto = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtBNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORMULARIO ASISTENCIA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnGrabarAsistenciaAlumno.setBackground(new java.awt.Color(152, 201, 167));
        jbtnGrabarAsistenciaAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
        jbtnGrabarAsistenciaAlumno.setText("ASISTENCIA DE ESTUDINATES");
        jbtnGrabarAsistenciaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarAsistenciaAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGrabarAsistenciaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, -1, 46));

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 123, 26));

        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 123, 26));

        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 123, 26));

        tbDatos.setBackground(new java.awt.Color(255, 77, 94));
        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1260, 230));

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
        getContentPane().add(btnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, 180, 60));

        jbtnGrabarAsistenciaAlumno2.setBackground(new java.awt.Color(152, 201, 167));
        jbtnGrabarAsistenciaAlumno2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrador.png"))); // NOI18N
        jbtnGrabarAsistenciaAlumno2.setText("LABORATORIOS");
        jbtnGrabarAsistenciaAlumno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarAsistenciaAlumno2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGrabarAsistenciaAlumno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 180, 46));

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
        getContentPane().add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 130, 60));

        btnVer.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sitio-web(1).png"))); // NOI18N
        btnVer.setText("Ver Alumnos ");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 410, 30));

        btnBuscar1.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carpeta.png"))); // NOI18N
        btnBuscar1.setText("VER ESTUDIANTES");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 210, 50));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 180, 30));
        getContentPane().add(txtBNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 180, 30));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 180, 30));

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

    private void jbtnGrabarAsistenciaAlumno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarAsistenciaAlumno2ActionPerformed
       Monitoreo_De_Laboratorios Monitoreo_De_Laboratorios= new Monitoreo_De_Laboratorios();
       Monitoreo_De_Laboratorios.setVisible(true);
    }//GEN-LAST:event_jbtnGrabarAsistenciaAlumno2ActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
String input = JOptionPane.showInputDialog(null, "Ingrese el ID del estudiante:", "ID del Estudiante", JOptionPane.QUESTION_MESSAGE);
    if (input != null && !input.trim().isEmpty()) {
        new FaceRecognition(input);
    } else {
        JOptionPane.showMessageDialog(null, "ID del estudiante no válido. Por favor, ingrese un valor.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnFotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFotoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFotoKeyPressed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
AlumnoDAO alumnoDAO = new AlumnoDAOImpl();
    try {
        List<Alumno> alumnos = alumnoDAO.obtenerTodosLosAlumnos();
        mostrarAlumnosEnTabla(alumnos);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al obtener los datos de los alumnos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
   String codigo = txtCodigo.getText().trim();
    String nombre = txtBNombre.getText().trim();
    String apellido = txtApellido.getText().trim();

    AlumnoDAO alumnoDAO = new AlumnoDAOImpl();
    try {
        List<Alumno> alumnos = alumnoDAO.obtenerAlumnosPorFiltros(codigo, nombre, apellido);
        mostrarAlumnosEnTabla(alumnos); // Usa mostrarAlumnosEnTabla
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al obtener los datos de los alumnos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnQR;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnGrabarAsistenciaAlumno;
    private javax.swing.JButton jbtnGrabarAsistenciaAlumno2;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBNombre;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
