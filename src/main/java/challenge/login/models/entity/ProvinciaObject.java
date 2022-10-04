package challenge.login.models.entity;

import java.util.List;

public class ProvinciaObject {

	private Integer cantidad;
	private Integer inicio;
	private List<Provincia> provincias;
	private Integer total;

	public ProvinciaObject() {
	}

	public ProvinciaObject(Integer cantidad, Integer inicio, List<Provincia> provincias,
			Integer total) {
		super();
		this.cantidad = cantidad;
		this.inicio = inicio;
		this.provincias = provincias;
		this.total = total;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getInicio() {
		return inicio;
	}

	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
