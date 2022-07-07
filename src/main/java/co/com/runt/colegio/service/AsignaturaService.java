package co.com.runt.colegio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.runt.colegio.data.repository.AsignaturaRepository;

/**
 * 
 * @author saligohe
 *
 */
@Service
public class AsignaturaService {
    
    @Autowired
    private AsignaturaRepository repository;
    
    public List<?> findByProfesor(Long id){
           return this.repository.finByProfesor(id);
    }
    
}
