package co.com.runt.colegio.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.runt.colegio.entity.Profesor;

/**
 * 
 * @author saligohe
 *
 */
public interface ProfesorRepository extends JpaRepository<Profesor, Long>  {
    
}
