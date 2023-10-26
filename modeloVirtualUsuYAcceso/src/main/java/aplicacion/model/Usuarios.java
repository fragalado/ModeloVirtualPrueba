package aplicacion.model;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(schema = "gbp_operacional")
public class Usuarios {
	
	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_usuario;
	
	@Column(name = "dni_usuario")
	private String dni_usuario;
	
	@Column(name = "nombre_usuario")
	private String nombre_usuario;
	
	@Column(name = "apellidos_usuario")
	private String apellidos_usuario;
	
	@Column(name = "tlf_usuario")
	private String tlf_usuario;
	
	@Column(name = "email_usuario")
	private String email_usuario;
	
	@Column(name = "clave_usuario")
	private String clave_usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_acceso")
	Accesos id_acceso;
	
	@Column(name = "estaBloqueado_usuario")
	private boolean estaBloqueado_usuario;
	
	@Column(name = "fch_fin_bloqueo_usuario")
	private Calendar fch_fin_bloqueo_usuario;
	
	@Column(name = "fch_alta_usuario")
	private Calendar fch_alta_usuario;
	
	@Column(name = "fch_baja_usuario")
	private Calendar fch_baja_usuario;
	
	// Getter y Setters
	
	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getDni_usuario() {
		return dni_usuario;
	}

	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getApellidos_usuario() {
		return apellidos_usuario;
	}

	public void setApellidos_usuario(String apellidos_usuario) {
		this.apellidos_usuario = apellidos_usuario;
	}

	public String getTlf_usuario() {
		return tlf_usuario;
	}

	public void setTlf_usuario(String tlf_usuario) {
		this.tlf_usuario = tlf_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getClave_usuario() {
		return clave_usuario;
	}

	public void setClave_usuario(String clave_usuario) {
		this.clave_usuario = clave_usuario;
	}

	public Accesos getId_acceso() {
		return id_acceso;
	}

	public void setId_acceso(Accesos id_acceso) {
		this.id_acceso = id_acceso;
	}

	public boolean isEstaBloqueado_usuario() {
		return estaBloqueado_usuario;
	}

	public void setEstaBloqueado_usuario(boolean estaBloqueado_usuario) {
		this.estaBloqueado_usuario = estaBloqueado_usuario;
	}

	public Calendar getFch_fin_bloqueo_usuario() {
		return fch_fin_bloqueo_usuario;
	}

	public void setFch_fin_bloqueo_usuario(Calendar fch_fin_bloqueo_usuario) {
		this.fch_fin_bloqueo_usuario = fch_fin_bloqueo_usuario;
	}

	public Calendar getFch_alta_usuario() {
		return fch_alta_usuario;
	}

	public void setFch_alta_usuario(Calendar fch_alta_usuario) {
		this.fch_alta_usuario = fch_alta_usuario;
	}

	public Calendar getFch_baja_usuario() {
		return fch_baja_usuario;
	}

	public void setFch_baja_usuario(Calendar fch_baja_usuario) {
		this.fch_baja_usuario = fch_baja_usuario;
	}
	
	// Constructores
	
	public Usuarios(int id_usuario, String dni_usuario, String nombre_usuario, String apellidos_usuario,
			String tlf_usuario, String email_usuario, String clave_usuario, Accesos id_acceso,
			boolean estaBloqueado_usuario, Calendar fch_fin_bloqueo_usuario, Calendar fch_alta_usuario,
			Calendar fch_baja_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.dni_usuario = dni_usuario;
		this.nombre_usuario = nombre_usuario;
		this.apellidos_usuario = apellidos_usuario;
		this.tlf_usuario = tlf_usuario;
		this.email_usuario = email_usuario;
		this.clave_usuario = clave_usuario;
		this.id_acceso = id_acceso;
		this.estaBloqueado_usuario = estaBloqueado_usuario;
		this.fch_fin_bloqueo_usuario = fch_fin_bloqueo_usuario;
		this.fch_alta_usuario = fch_alta_usuario;
		this.fch_baja_usuario = fch_baja_usuario;
	}
	
	public Usuarios() {
	}
}
