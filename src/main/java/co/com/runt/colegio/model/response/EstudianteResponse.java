package co.com.runt.colegio.model.response;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import co.com.runt.colegio.entity.Estudiante;

/**
 * 
 * @author saligohe
 *
 */
public class EstudianteResponse {
	private String nombre;

	public EstudianteResponse() {
	}

	public EstudianteResponse(String nombre) {
		this.nombre = nombre;
	}

	public EstudianteResponse(Estudiante estudiante) {
		this.nombre = estudiante.getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static ArrayList<EstudianteResponse> getEstudiantes(List<Estudiante> estudiante) {
		ArrayList<EstudianteResponse> estudiantesR = new ArrayList<EstudianteResponse>();

		Iterator<Estudiante> iEstudiante = estudiante.iterator();

		while (iEstudiante.hasNext()) {
			EstudianteResponse estudianteR = new EstudianteResponse(iEstudiante.next());
			estudiantesR.add(estudianteR);
		}
		return estudiantesR;
	}
}
