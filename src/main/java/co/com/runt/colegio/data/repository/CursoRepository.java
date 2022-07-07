package co.com.runt.colegio.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.runt.colegio.entity.Curso;

/**
 * 
 * @author saligohe
 *
 */
public interface CursoRepository  extends JpaRepository<Curso, Long> {
    
}
