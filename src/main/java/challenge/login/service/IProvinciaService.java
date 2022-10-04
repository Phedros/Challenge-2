package challenge.login.service;


import challenge.login.models.entity.Centroide;
import challenge.login.models.entity.ProvinciaObject;

public interface IProvinciaService {
	
	public ProvinciaObject getProvincias();
	public Centroide ubicacion( String provincia);

}
