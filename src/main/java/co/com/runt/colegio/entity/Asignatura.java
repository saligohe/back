package co.com.runt.colegio.entity;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * 
 * @author saligohe
 *
 */
@Entity
public class Asignatura implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -975947082360384129L;

	public Asignatura() {
    }

    public Asignatura(String nombre, Curso curso, Profesor profesor) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
    }
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
	@ManyToOne
	@JoinColumn(name = "fk_curso", nullable = false, updatable = false)
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "fk_profesor", nullable = false, updatable = false)
    private Profesor profesor;
    
    @JoinTable(
        name = "asignatura_estudiante",
        joinColumns = @JoinColumn(name = "fk_asignatura", nullable = false, referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name="fk_estudiante", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Estudiante> estudiantes;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the profesor
	 */
	public Profesor getProfesor() {
		return profesor;
	}

	/**
	 * @param profesor the profesor to set
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	/**
	 * @return the estudiantes
	 */
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, estudiantes, id, nombre, profesor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(curso, other.curso) && Objects.equals(estudiantes, other.estudiantes) && id == other.id
				&& Objects.equals(nombre, other.nombre) && Objects.equals(profesor, other.profesor);
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (curso != null ? "curso=" + curso + ", " : "")
				+ (profesor != null ? "profesor=" + profesor + ", " : "")
				+ (estudiantes != null ? "estudiantes=" + estudiantes : "") + "]";
	}
     
}
