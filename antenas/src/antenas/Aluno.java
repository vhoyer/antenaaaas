package antenas;

public class Aluno {
	private DadosLogin dadoslogin;
	private String nome;
	private String curso;
	private String ra;
	
	public Aluno( DadosLogin dadoslogin, String nome, String curso, String ra) {
		this.dadoslogin = dadoslogin;
		this.nome = nome;
		this.curso = curso;
		this.ra = ra;	
	}

	public DadosLogin getDadosLogin() {
		return dadoslogin;
	}

	public void setDadosLogin(DadosLogin dadoslogin) {
		this.dadoslogin = dadoslogin;
	}

	public String getNome() {
		return this.nome;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getCurso() {
		return this.curso;
	}

	public String setCurso(String curso) {
		return this.curso = curso;
	}

	public String getRa() {
		return this.ra;
	}

	public String setRa(String ra) {
		return this.ra = ra;
	}
}
