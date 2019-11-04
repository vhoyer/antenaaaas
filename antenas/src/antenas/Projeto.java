package antenas;

public class Projeto {

	private String chave;
	//acrescentar todos os demais atributos do projeto que foram passados na fase de requisitos
	private String empresario;
	private String titulo;
	private String descricao;
	private String link;

	public Projeto(String chave) {
		this.chave = chave;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getEmpresario() {
		return this.empresario;
	}

	public String setEmpresario(String value) {
		return this.email = value;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String setTitulo(String value) {
		return this.email = value;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public String setDescricao(String value) {
		return this.email = value;
	}

	public String getLink() {
		return this.link;
	}

	public String setLink(String value) {
		return this.email = value;
	}
}
