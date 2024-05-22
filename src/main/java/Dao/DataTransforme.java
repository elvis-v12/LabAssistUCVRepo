package Dao;

import SoftwareAsistencia.dto.AsignaturaAlumnoDTO;
import SoftwareAsistencia.controller.AlumnoController;
import SoftwareAsistencia.controller.AsignaturaAlumnoController;
import SoftwareAsistencia.controller.AsignaturaController;
import SoftwareAsistencia.dto.AlumnoDto;
import static SoftwareAsistencia.util.Data.getAlumnos;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author elnoe
 */
public class DataTransforme {

        public static List<AsignaturaAlumnoDTO> asignaturasAlumnos() {
                var alumnos = new AlumnoController().readAll();
                var asignaturas_alumnos = new AsignaturaAlumnoController().readAll();
                var asignaturas = new AsignaturaController().readAll();

                return asignaturas_alumnos.stream()
                        .flatMap(asignatura_alumno -> {
                                var alumnoAgregar = alumnos.stream()
                                        .filter(alumno -> alumno.getID_Alumno() == asignatura_alumno.getID_Alumno())
                                        .findFirst();
                                var asignaturaAgregar = asignaturas.stream()
                                        .filter(asignatura -> asignatura.getId() == asignatura_alumno.getID_Asignatura())
                                        .findFirst();

                                return alumnoAgregar.isPresent() && asignaturaAgregar.isPresent()
                                        ? Stream.of(new AsignaturaAlumnoDTO(asignatura_alumno.getID_AlumnoAsignatura(),
                                                                            alumnoAgregar.get(),
                                                                            asignaturaAgregar.get()))
                                        : Stream.empty();

                        })
                        .collect(Collectors.toList());
        }

        public static List<AlumnoDto> alumnos(String curso) {
                return getAlumnos(curso).stream()
                        .flatMap(alumno -> {
                                return Stream.of(new AlumnoDto(alumno.getID_Alumno(), alumno.getNombre()));
                        })
                        .collect(Collectors.toList());
        }

}
