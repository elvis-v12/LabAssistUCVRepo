package SoftwareAsistencia.doa;

import java.util.List;

/**
 *
 * @author elnoe
 */
public interface Dao<T> {

        public void create(T entity);

        public T read(Integer id_entity);

        public List<T> readAll();

        public T update(T entity);

        public void delete(Integer id_entity);

}
