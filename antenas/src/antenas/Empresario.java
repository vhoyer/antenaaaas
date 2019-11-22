package antenas;

public class Empresario {
	private String cpf;
	private DadosLogin dadosLogin;

	public Empresario(String cpf, String email, String senha) {
		this.cpf = cpf;
		this.dadosLogin = new DadosLogin(email, senha)
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public DadosLogin getDadosLogin() {
		return dadosLogin;
	}

	public void setDadosLogin(DadosLogin dadosLogin) {
		this.dadosLogin = dadosLogin;
	}
}
