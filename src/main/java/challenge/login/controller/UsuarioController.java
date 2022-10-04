package challenge.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.login.models.entity.Centroide;
import challenge.login.models.entity.Provincia;
import challenge.login.models.entity.Usuario;
import challenge.login.service.IUsuarioService;
import challenge.login.service.ResponseLogin;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	private ResponseLogin responseLogin;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuario usuario) {
		usuarioService.save(usuario);
	}
	
	@PostMapping("/validar")
	public ResponseLogin validar(@RequestBody Usuario usuario) {
		responseLogin = new ResponseLogin();
		responseLogin.setResult(usuarioService.validateLogin(usuario));
		return responseLogin;
		
	}
	
	
	

}
