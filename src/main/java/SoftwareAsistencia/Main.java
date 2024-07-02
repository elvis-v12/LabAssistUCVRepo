package SoftwareAsistencia;


import SoftwareAsistencia.model.AlumnoService;

public class Main {
    public static void main(String[] args) {
        AlumnoService alumnoService = new AlumnoService();
        String filePath = "C:\\Users\\ELVIS\\OneDrive\\Documentos\\NetBeansProjects\\SoftwareReconocimientoFacilUCV\\reporte_alumnos.pdf";
        alumnoService.generarReporteAlumnos(filePath);
    }
}
