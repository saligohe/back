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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author saligohe
 *
 */
@Entity
@Table(name = "Curso")
public class Curso implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2497253313775562561L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "grado", nullable = false)
	private int grado;

	@Column(name = "salon", nullable = false)
	private String salon;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
	private List<Asignatura> asignaturas;

	@ManyToOne
	@JoinColumn(name = "fk_colegio", nullable = false, updatable = false)
	private Colegio colegio;

	public Curso() {
	}

	public Curso(int grado, String salon, List<Asignatura> asignaturas) {
		this.grado = grado;
		this.salon = salon;
		this.asignaturas = asignaturas;
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

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Colegio getColegio() {
		return colegio;
	}

	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asignaturas, colegio, grado, id, salon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(asignaturas, other.asignaturas) && Objects.equals(colegio, other.colegio)
				&& grado == other.grado && id == other.id && Objects.equals(salon, other.salon);
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", grado=" + grado + ", " + (salon != null ? "salon=" + salon + ", " : "")
				+ (asignaturas != null ? "asignaturas=" + asignaturas + ", " : "")
				+ (colegio != null ? "colegio=" + colegio : "") + "]";
	}

	
}
