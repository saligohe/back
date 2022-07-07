package co.com.runt.colegio.model.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import co.com.runt.colegio.entity.Curso;

/**
 * 
 * @author saligohe
 *
 */
public class CursoResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3039129395787530918L;
	private int grado;
	private String salon;

	public CursoResponse() {
	}

	public CursoResponse(Curso curso) {
		this.grado = curso.getGrado();
		this.salon = curso.getSalon();
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public static ArrayList<CursoResponse> getCursos(ArrayList<Curso> curso) {
		ArrayList<CursoResponse> cursosR = new ArrayList<CursoResponse>();

		Iterator<Curso> iCurso = curso.iterator();

		while (iCurso.hasNext()) {
			CursoResponse cursoR = new CursoResponse(iCurso.next());
			cursosR.add(cursoR);
		}
		return cursosR;
	}
}
