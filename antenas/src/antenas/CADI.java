package antenas;

public class CADI {
	private DadosLogin dadoslogin;
	private String matricula;
	
	public CADI( DadosLogin dadoslogin, String matricula) {
		this.dadoslogin = dadoslogin;
		this.matricula = matricula;	
	}
	
	public DadosLogin getDadosLogin() {
		return dadoslogin;
	}

	public void setDadosLogin(DadosLogin dadoslogin) {
		this.dadoslogin = dadoslogin;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public String setMatricula(String matricula) {
		return this.matricula = matricula;
	}
}
