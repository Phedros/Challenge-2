package challenge.login.service;

import challenge.login.models.entity.Usuario;

public interface IUsuarioService {
	
	public void save(Usuario usuario);
	public Boolean validateLogin(Usuario usuario);

}
