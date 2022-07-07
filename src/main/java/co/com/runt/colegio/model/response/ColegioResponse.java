package co.com.runt.colegio.model.response;

import java.util.ArrayList;
import java.util.Iterator;

import co.com.runt.colegio.entity.Colegio;

/**
 * 
 * @author saligohe
 *
 */
public class ColegioResponse {

	private String nombre;

	public ColegioResponse() {
	}

	public ColegioResponse(String nombre) {
		this.nombre = nombre;
	}

	public ColegioResponse(Colegio colegio) {
		this.nombre = colegio.getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static ArrayList<ColegioResponse> getColegios(ArrayList<Colegio> colegio) {
		ArrayList<ColegioResponse> colegiosR = new ArrayList<ColegioResponse>();

		Iterator<Colegio> iColegio = colegio.iterator();

		while (iColegio.hasNext()) {
			ColegioResponse colegioR = new ColegioResponse(iColegio.next());
			colegiosR.add(colegioR);
		}
		return colegiosR;
	}

}
