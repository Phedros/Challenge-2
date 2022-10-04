package challenge.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import challenge.login.models.entity.Centroide;
import challenge.login.models.entity.Provincia;
import challenge.login.models.entity.ProvinciaObject;

@Service
public class ProvinciaServiceImpl implements IProvinciaService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static String url = "https://apis.datos.gob.ar/georef/api/provincias";
	
	
	
	
	public ProvinciaObject getProvincias(){
		return restTemplate.getForObject(url, ProvinciaObject.class);		
	}
	
	
	public Centroide ubicacion(String provincia) {
		for(Provincia prov: restTemplate.getForObject(url, ProvinciaObject.class).getProvincias()) {
			if (prov.getNombre().replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").equalsIgnoreCase(provincia)) {
				return prov.getCentroide();
			}
		}
		return null;
	}
	
	

}
