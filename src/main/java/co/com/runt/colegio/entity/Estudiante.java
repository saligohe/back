package co.com.runt.colegio.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 * @author saligohe
 *
 */
@Entity
public class Estudiante {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre", nullable = false)
    private String nombre;
    
    
    @ManyToMany(mappedBy = "estudiantes")
    private List<Asignatura> asignaturas;

    public Estudiante() {
    }

    public Estudiante(String nombre, List<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
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
	 * @return the asignaturas
	 */
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asignaturas, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(asignaturas, other.asignaturas) && id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (asignaturas != null ? "asignaturas=" + asignaturas : "") + "]";
	}

}
