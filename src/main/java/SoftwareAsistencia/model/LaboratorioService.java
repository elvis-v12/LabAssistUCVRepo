package SoftwareAsistencia.model;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import SoftwareAsistencia.model.Laboratorio;
import SoftwareAsistencia.model.dao.LaboratorioDAOImpl;

import java.sql.SQLException;
import java.util.List;

public class LaboratorioService {
    private LaboratorioDAOImpl laboratorioDAO;

    public LaboratorioService() {
        this.laboratorioDAO = new LaboratorioDAOImpl();
    }

    public void generarReporteLaboratorio(String filePath) {
        try {
            List<Laboratorio> laboratorios = laboratorioDAO.obtenerReporteLaboratorio();

            PdfWriter writer = new PdfWriter(filePath);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);
            document.add(new Paragraph("Reporte de Laboratorios"));

            float[] columnWidths = {100, 50, 100, 50, 100, 100, 100};
            Table table = new Table(columnWidths);
            table.addHeaderCell("Laboratorio Nombre");
            table.addHeaderCell("Capacidad");
            table.addHeaderCell("Curso Nombre");
            table.addHeaderCell("Asistencia %");
            table.addHeaderCell("Estado Asistencia");
            table.addHeaderCell("Alumno Nombres");
            table.addHeaderCell("Alumno Apellidos");

            for (Laboratorio laboratorio : laboratorios) {
                table.addCell(laboratorio.getLaboratorioNombre() != null ? laboratorio.getLaboratorioNombre() : "");
                table.addCell(String.valueOf(laboratorio.getLaboratorioCapacidad()));
                table.addCell(laboratorio.getCursos().getCursoNombre() != null ? laboratorio.getCursos().getCursoNombre() : "");
                table.addCell(String.valueOf(laboratorio.getAsistencia().getAsistenciaPorcentaje()));
                table.addCell(laboratorio.getAsistencia().getAsistenciaEstado() != null ? laboratorio.getAsistencia().getAsistenciaEstado() : "");
                table.addCell(laboratorio.getAlumno().getAlumnoNombres() != null ? laboratorio.getAlumno().getAlumnoNombres() : "");
                table.addCell(laboratorio.getAlumno().getAlumnoApellidos() != null ? laboratorio.getAlumno().getAlumnoApellidos() : "");
            }

            document.add(table);
            document.close();
            System.out.println("Reporte de laboratorio generado en: " + filePath);
        } catch (SQLException e) {
            System.err.println("Error al obtener los datos del laboratorio");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
