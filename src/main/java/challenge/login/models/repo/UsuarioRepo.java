package challenge.login.models.repo;

import org.springframework.data.repository.CrudRepository;

import challenge.login.models.entity.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {

}
