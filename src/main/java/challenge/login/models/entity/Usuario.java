package challenge.login.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String usuario;
	
	private String contrasena;

	
	
	public Usuario() {
		super();
	}
	
	

	public Usuario(String usuario, String contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}



	public Usuario(Integer id, String usuario, String contrasena) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public Integer getId() {
		return id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

}
