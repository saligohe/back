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
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
 * @author saligohe
 *
 */
@Entity 
@Table(name = "Colegio")
public class Colegio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 842627573880201697L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre", nullable = false)
    private String nombre;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colegio")
    private List<Curso> curso;
    
	/**
	 * 
	 */
	public Colegio() {
	}

	/**
	 * @param nombre
	 * @param curso
	 */
	public Colegio(String nombre, List<Curso> curso) {
		this.nombre = nombre;
		this.curso = curso;
	}

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
	public List<Curso> getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colegio other = (Colegio) obj;
		return Objects.equals(curso, other.curso) && id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Colegio [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (curso != null ? "curso=" + curso : "") + "]";
	}

    
    
}
