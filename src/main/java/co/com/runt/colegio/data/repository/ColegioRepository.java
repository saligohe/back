package co.com.runt.colegio.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.runt.colegio.entity.Colegio;

/**
 * 
 * @author saligohe
 *
 */
public interface ColegioRepository extends JpaRepository<Colegio, Long>{
    
}
