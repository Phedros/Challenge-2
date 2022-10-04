package challenge.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import challenge.login.models.entity.Centroide;
import challenge.login.models.entity.Provincia;
import challenge.login.models.entity.ProvinciaObject;

@RestController
public class ApiController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static String url = "https://apis.datos.gob.ar/georef/api/provincias";
	
	
	
	@GetMapping("/provincias")
	public ProvinciaObject getProvincias(){
		return restTemplate.getForObject(url, ProvinciaObject.class);		
	}
	
	@GetMapping("/ubicacion/{provincia}")
	public Centroide ubicacion(@PathVariable String provincia) {
		for(Provincia prov: restTemplate.getForObject(url, ProvinciaObject.class).getProvincias()) {
			if (prov.getNombre().replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").equalsIgnoreCase(provincia)) {
				return prov.getCentroide();
			}
		}
		return null;
	}

}
