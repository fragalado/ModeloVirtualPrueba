package aplicacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "gbp_operacional")
public class Accesos {
	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_acceso;
	
	@Column(name = "codigo_acceso")
	private String codigo_acceso;
	
	@Column(name = "descripcion_acceso")
	private String descripcion_acceso;
	
	// Getter y setter
	
	public long getId_acceso() {
		return id_acceso;
	}

	public void setId_acceso(long id_acceso) {
		this.id_acceso = id_acceso;
	}

	public String getCodigo_acceso() {
		return codigo_acceso;
	}

	public void setCodigo_acceso(String codigo_acceso) {
		this.codigo_acceso = codigo_acceso;
	}

	public String getDescripcion_acceso() {
		return descripcion_acceso;
	}

	public void setDescripcion_acceso(String descripcion_acceso) {
		this.descripcion_acceso = descripcion_acceso;
	}
	
	// Constructores
	
	public Accesos(String codigo_acceso, String descripcion_acceso) {
		super();
		this.codigo_acceso = codigo_acceso;
		this.descripcion_acceso = descripcion_acceso;
	}
}
