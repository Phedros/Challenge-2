package challenge.login.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

import challenge.login.models.entity.Usuario;

@SpringBootTest
public class UsuarioServiceImplTest {
	
	
	
	@Autowired
	UsuarioServiceImpl usuarioService;
	
	@Test
	public void validateLoginTest() {
		Usuario u = new Usuario("Pedro","1234");
		assertEquals(true, usuarioService.validateLogin(u));
	}
	
	@Test
	public void validateLoginFalseTest() {
		Usuario u = new Usuario("Elvis","1234");
		assertEquals(false, usuarioService.validateLogin(u));
	}
	
	

}
