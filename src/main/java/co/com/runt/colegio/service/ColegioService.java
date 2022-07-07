package co.com.runt.colegio.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.runt.colegio.data.repository.ColegioRepository;

/**
 * 
 * @author saligohe
 *
 */
@Service
public class ColegioService {
	@Autowired
	private ColegioRepository repository;

	public List<?> getColeggio() {

		return repository.findAll();
	}
}
