package co.com.runt.colegio.model.response;

import java.util.ArrayList;
import java.util.Iterator;

import co.com.runt.colegio.entity.Profesor;

/**
 * 
 * @author saligohe
 *
 */
public class ProfesorResponse {
	private Long id;
	private String nombre;

	public ProfesorResponse() {
	}

	public ProfesorResponse(Profesor profesor) {
		this.id = profesor.getId();
		this.nombre = profesor.getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public static ArrayList<ProfesorResponse> getProfesor(ArrayList<Profesor> profesor) {
		ArrayList<ProfesorResponse> profesoresR = new ArrayList<ProfesorResponse>();

		Iterator<Profesor> iProfesor = profesor.iterator();

		while (iProfesor.hasNext()) {
			ProfesorResponse profesorR = new ProfesorResponse(iProfesor.next());
			profesoresR.add(profesorR);
		}
		return profesoresR;
	}
}
