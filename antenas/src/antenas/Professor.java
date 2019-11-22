package antenas;

public class Professor {
	private DadosLogin dadosLogin;

	public Professor(String email, String senha) {
		this.dadosLogin = new DadosLogin(email, senha)
	}

	public DadosLogin getDadosLogin() {
		return dadosLogin;
	}

	public void setDadosLogin(DadosLogin dadosLogin) {
		this.dadosLogin = dadosLogin;
	}
}
