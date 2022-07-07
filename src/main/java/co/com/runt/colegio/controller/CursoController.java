package co.com.runt.colegio.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.runt.colegio.entity.Curso;
import co.com.runt.colegio.model.response.CursoResponse;
import co.com.runt.colegio.service.CursoService;
import co.com.runt.colegio.util.Data;

/**
 * 
 * @author saligohe
 *
 */
@RestController
public class CursoController {

	@Autowired
	private CursoService service;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/curso")
	@ResponseBody
	public ResponseEntity<?> getCurso() {

		try {
			ArrayList<CursoResponse> curso = CursoResponse.getCursos((ArrayList<Curso>) service.finAll());
			return new ResponseEntity(new Data(curso), HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
