
public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException{
		
		if (login.equals("emanuel") && senha.equals("senha")) {
			return new Usuario(login);
		}
		
		throw new LoginException("Usuário ou senha incorretos.", login);
	}
}
