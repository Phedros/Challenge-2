package challenge.login.models.entity;

import java.text.Normalizer;

public class Provincia {

	private Centroide centroide;
	private Integer id;
	private String nombre;

	public Provincia() {
	}
	
	public static String normalizeString(String str){
		 str=Normalizer.normalize(str,Normalizer.Form.NFKD);
		 return str.replaceAll("[^a-z,^A-Z,^0-9]", "");
		}

	public Provincia(Centroide centroide, Integer id, String nombre) {
		super();
		this.centroide = centroide;
		this.id = id;
		this.nombre = nombre;
	}

	public Centroide getCentroide() {
		return centroide;
	}

	public void setCentroide(Centroide centroide) {
		this.centroide = centroide;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
