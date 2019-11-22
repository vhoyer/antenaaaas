package antenas;

public class Entrega {
	private String aluno;
	private String descricaoEntrega;
	private String linkRepositorio;
	
	
	public Entrega (String aluno, String descricaoEntrega, String linkRepositorio) {
		this.aluno = aluno;
		this.descricaoEntrega = descricaoEntrega;
		this.linkRepositorio = linkRepositorio;
	}
	
	
	
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public String getDescricaoEntrega() {
		return descricaoEntrega;
	}
	public void setDescricaoEntrega(String descricaoEntrega) {
		this.descricaoEntrega = descricaoEntrega;
	}
	public String getLinkRepositorio() {
		return linkRepositorio;
	}
	public void setLinkRepositorio(String linkRepositorio) {
		this.linkRepositorio = linkRepositorio;
	}
	
	
}
