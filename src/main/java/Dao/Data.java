package Dao;

import SoftwareAsistencia.model.Alumno;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static SoftwareAsistencia.util.DataTransforme.asignaturasAlumnos;

/**
 *
 * @author elnoe
 */
public class Data {

        public static String getString(Supplier<Object> get) {
                return get.get() == null ? "" : String.valueOf(get.get());
        }

        public static String getDateString() {
                Date ahora = new Date();

                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm");

                String fechaYHoraFormateada = formato.format(ahora);

                return fechaYHoraFormateada;
        }

        public static List<Alumno> getAlumnos(String Curso) {
                return asignaturasAlumnos().stream()
                        .flatMap(value -> {
                                if (value.getAsignatura().getNombre().equals(Curso)) {
                                        return Stream.of(value.getAlumno());
                                } else {
                                        return Stream.empty();
                                }

                        })
                        .collect(Collectors.toList());
        }

}
