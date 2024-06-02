package SoftwareAsistencia.model;


import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import SoftwareAsistencia.model.Alumno;
import java.util.List;

public class ReporteService {
    public static void generarReporteAsistencia(String filePath, List<Alumno> alumnos) {
        try {
            PdfWriter writer = new PdfWriter(filePath);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);

            document.add(new Paragraph("Reporte de Asistencia de Estudiantes"));
            
            float[] columnWidths = {50, 100, 100, 150, 100, 100, 100, 100};
            Table table = new Table(columnWidths);
            table.addHeaderCell("Código");
            table.addHeaderCell("Nombres");
            table.addHeaderCell("Apellidos");
            table.addHeaderCell("Email");
            table.addHeaderCell("Carrera");
            table.addHeaderCell("Curso");
            table.addHeaderCell("Asistencias");
            table.addHeaderCell("Faltas");

            for (Alumno alumno : alumnos) {
                table.addCell(String.valueOf(alumno.getAlumnoCodigo()));
                table.addCell(alumno.getAlumnoNombres());
                table.addCell(alumno.getAlumnoApellidos());
                table.addCell(alumno.getAlumnoEmail());
                table.addCell(alumno.getAlumnoCarreraProfesional());
                table.addCell(alumno.getAsistencia().getCursoNombre());
                table.addCell(String.valueOf(alumno.getAsistencia().getAsistencias()));
                table.addCell(String.valueOf(alumno.getAsistencia().getFaltas()));
            }

            document.add(table);
            document.close();
            System.out.println("Reporte de asistencia generado en: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
