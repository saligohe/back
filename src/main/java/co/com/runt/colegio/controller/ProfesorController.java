package co.com.runt.colegio.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.runt.colegio.entity.Profesor;
import co.com.runt.colegio.model.response.ProfesorResponse;
import co.com.runt.colegio.service.ProfesorService;
import co.com.runt.colegio.util.Data;

/**
 * 
 * @author saligohe
 *
 */
@RestController
public class ProfesorController {
	@Autowired
	private ProfesorService service;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/profesor")
	@ResponseBody
	public ResponseEntity<?> getProfesor() {

		try {
			ArrayList<ProfesorResponse> profesor = ProfesorResponse
					.getProfesor((ArrayList<Profesor>) service.findall());
			return new ResponseEntity(new Data(profesor), HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
