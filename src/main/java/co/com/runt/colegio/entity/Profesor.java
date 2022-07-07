package co.com.runt.colegio.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author saligohe
 *
 */
@Entity
public class Profesor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre", nullable = false)
    private String nombre;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profesor")
    private List<Asignatura> asignaturas;

    public Profesor() {
    }

    public Profesor(String nombre, ArrayList<Asignatura> asignaturas) {
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

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

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
		Profesor other = (Profesor) obj;
		return Objects.equals(asignaturas, other.asignaturas) && id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (asignaturas != null ? "asignaturas=" + asignaturas : "") + "]";
	}
    
    
}
