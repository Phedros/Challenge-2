package challenge.login.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import challenge.login.models.entity.Usuario;
import challenge.login.models.repo.UsuarioRepo;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);

	@Autowired
	private UsuarioRepo usuarioRepo;
	
	@Override
	public void save(Usuario usuario) {
		usuarioRepo.save(usuario);
	}

	@Override
	public Boolean validateLogin(Usuario usuario) {
		
		List<Usuario> usuarios = (List<Usuario>) usuarioRepo.findAll();
		logger.info("Lista de usuarios");
		for (Usuario us:usuarios) {   //for(tipo variable:array){instructivo}
			logger.info(us.getUsuario());
			logger.info(us.getContrasena());
			if ( (us.getUsuario().equalsIgnoreCase(usuario.getUsuario())) 
			&& (us.getContrasena().equalsIgnoreCase(usuario.getContrasena()))){
				return true;
			}
		}
		return false;
	}

}
