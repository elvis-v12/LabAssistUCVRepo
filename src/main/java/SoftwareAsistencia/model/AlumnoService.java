package SoftwareAsistencia.model;


import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import SoftwareAsistencia.model.Alumno;
import SoftwareAsistencia.model.dao.AlumnoDAOImpl;

import java.sql.SQLException;
import java.util.List;

public class AlumnoService {
    private AlumnoDAOImpl alumnoDAO;

    public AlumnoService() {
        this.alumnoDAO = new AlumnoDAOImpl();
    }

    public void generarReporteAlumnos(String filePath) {
        try {
            List<Alumno> alumnos = alumnoDAO.obtenerTodosLosAlumnos();

            PdfWriter writer = new PdfWriter(filePath);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);
            document.add(new Paragraph("Reporte de Alumnos"));

            float[] columnWidths = {100, 100, 100, 100, 100, 50, 50, 100};
            Table table = new Table(columnWidths);
            table.addHeaderCell("Código");
            table.addHeaderCell("Nombres");
            table.addHeaderCell("Apellidos");
            table.addHeaderCell("Email");
            table.addHeaderCell("Carrera Profesional");
            table.addHeaderCell("Ciclo");
            table.addHeaderCell("Asistencia %");
            table.addHeaderCell("Estado Asistencia");
            table.addHeaderCell("Curso");

            for (Alumno alumno : alumnos) {
                // Verificar y manejar datos nulos
                String codigo = alumno.getAlumnoCdg() != null ? alumno.getAlumnoCdg() : "N/A";
                String nombres = alumno.getAlumnoNombres() != null ? alumno.getAlumnoNombres() : "N/A";
                String apellidos = alumno.getAlumnoApellidos() != null ? alumno.getAlumnoApellidos() : "N/A";
                String email = alumno.getAlumnoEmail() != null ? alumno.getAlumnoEmail() : "N/A";
                String carreraProfesional = alumno.getAlumnoCarreraProfesional() != null ? alumno.getAlumnoCarreraProfesional() : "N/A";
                String ciclo = alumno.getCiclo() != null ? alumno.getCiclo() : "N/A";
                String asistenciaPorcentaje = alumno.getAsistencia() != null ? String.valueOf(alumno.getAsistencia().getAsistenciaPorcentaje()) : "N/A";
                String asistenciaEstado = alumno.getAsistencia() != null ? alumno.getAsistencia().getAsistenciaEstado() : "N/A";
                String cursoNombre = alumno.getCurso() != null ? alumno.getCurso().getCursoNombre() : "N/A";

                table.addCell(codigo);
                table.addCell(nombres);
                table.addCell(apellidos);
                table.addCell(email);
                table.addCell(carreraProfesional);
                table.addCell(ciclo);
                table.addCell(asistenciaPorcentaje);
                table.addCell(asistenciaEstado);
                table.addCell(cursoNombre);

                // Imprimir datos para depuración
                System.out.println("Alumno agregado: " + nombres + " " + apellidos);
            }

            document.add(table);
            document.close();
            System.out.println("Reporte de alumnos generado en: " + filePath);
        } catch (SQLException e) {
            System.err.println("Error al obtener los datos de los alumnos");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


