package co.com.runt.colegio.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.runt.colegio.entity.Colegio;
import co.com.runt.colegio.model.response.ColegioResponse;
import co.com.runt.colegio.service.ColegioService;
import co.com.runt.colegio.util.Data;

/**
 * 
 * @author saligohe
 *
 */
@RestController
public class ColegioController {

	@Autowired
	private ColegioService service;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/colegio")
	@ResponseBody
	public ResponseEntity<?> getColegio() {

		try {
			ArrayList<ColegioResponse> colegio = ColegioResponse
					.getColegios((ArrayList<Colegio>) service.getColeggio());
			return new ResponseEntity(new Data(colegio), HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
