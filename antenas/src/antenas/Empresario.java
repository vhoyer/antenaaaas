package antenas;

public class Empresario {
	private String cpf;
	private DadosLogin dadoslogin;

	public Empresario(String cpf, DadosLogin dadoslogin) {
		this.cpf = cpf;
		this.dadoslogin = dadoslogin;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public DadosLogin getDadosLogin() {
		return dadoslogin;
	}

	public void setDadosLogin(DadosLogin dadoslogin) {
		this.dadoslogin = dadoslogin;
	}
}
