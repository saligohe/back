package co.com.runt.colegio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.runt.colegio.data.repository.CursoRepository;

/**
 * 
 * @author saligohe
 *
 */
@Service
public class CursoService {
	@Autowired
	private CursoRepository repository;

	public List<?> finAll() {
		return this.repository.findAll();
	}
}
