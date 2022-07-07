package co.com.runt.colegio.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.com.runt.colegio.entity.Asignatura;

/**
 * 
 * @author saligohe
 *
 */
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long>{
        @Query(value="select * from asignatura where asignatura.FK_PROFESOR  = :id ", nativeQuery = true)
        public List<Asignatura> finByProfesor (@Param("id")Long id);
}
