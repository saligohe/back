package co.com.runt.colegio.model.response;

import java.util.ArrayList;
import java.util.Iterator;

import co.com.runt.colegio.entity.Asignatura;

/**
 * 
 * @author saligohe
 *
 */
public class AsignaturaResponse {
    private String nombre;
    private CursoResponse curso;
    private ArrayList<EstudianteResponse> estudiantes;

    public AsignaturaResponse() {
    }

    public AsignaturaResponse(Asignatura asignatura) {
    	this.nombre = asignatura.getNombre();
    	this.curso = new CursoResponse(asignatura.getCurso());
    	this.estudiantes = EstudianteResponse.getEstudiantes(asignatura.getEstudiantes());
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     

    public ArrayList<EstudianteResponse> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<EstudianteResponse> estudiante) {
        this.estudiantes = estudiante;
    }

    public CursoResponse getCurso() {
        return curso;
    }

    public void setCurso(CursoResponse curso) {
        this.curso = curso;
    }
    
    
    public static ArrayList<AsignaturaResponse> getAsignaturas(ArrayList<Asignatura> asignaturas){
         ArrayList<AsignaturaResponse> asignaturasR = new ArrayList<AsignaturaResponse> ();
         
         Iterator<Asignatura> iAsignaturas = asignaturas.iterator();
         
         while (iAsignaturas.hasNext()) {
        	 AsignaturaResponse asignaturaR = new AsignaturaResponse(iAsignaturas.next());
        	 asignaturasR.add(asignaturaR);
         }
         
         return asignaturasR;
    }
    
}
