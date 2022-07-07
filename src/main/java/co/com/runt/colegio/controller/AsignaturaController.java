package co.com.runt.colegio.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.runt.colegio.entity.Asignatura;
import co.com.runt.colegio.model.response.AsignaturaResponse;
import co.com.runt.colegio.service.AsignaturaService;
import co.com.runt.colegio.util.Data;

/**
 * 
 * @author saligohe
 *
 */
@RestController
public class AsignaturaController {
	@Autowired
	private AsignaturaService service;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/asignatura")
	@ResponseBody
	public ResponseEntity<?> getColegio(@RequestParam Long id) {

		try {
			ArrayList<AsignaturaResponse> asignatura = AsignaturaResponse
					.getAsignaturas((ArrayList<Asignatura>) service.findByProfesor(id));
			return new ResponseEntity(new Data(asignatura), HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
