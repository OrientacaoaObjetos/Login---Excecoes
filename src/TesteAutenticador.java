import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador autenticador = new Autenticador();
		Usuario usuario = autenticador.logar("emanuel", "senha");
		assertEquals("emanuel", usuario.getLogin());
	}
	
	@Test(expected = LoginException.class)
	public void loginFalha() throws LoginException {
		Autenticador autenticador = new Autenticador();
		Usuario usuario = autenticador.logar("emanuel", "senhaerrada");
	}
	
	@Test
	public void informacaoErro() throws LoginException {
		Autenticador autenticador = new Autenticador();
		try {
			Usuario usuario = autenticador.logar("emanuel", "senhaerrada");
			fail();
			
		} catch (LoginException e) {
			assertEquals("emanuel", e.getLogin());
		}
	}

}
