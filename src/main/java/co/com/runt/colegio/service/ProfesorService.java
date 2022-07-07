package co.com.runt.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.runt.colegio.data.repository.ProfesorRepository;

/**
 * 
 * @author saligohe
 *
 */
@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository repository;
    
    public List<?> findall() {
        
        return repository.findAll();
    }
}
