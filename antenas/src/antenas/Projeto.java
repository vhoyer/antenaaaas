package antenas;

public class Projeto {
	private String chave;
	//acrescentar todos os demais atributos do projeto que foram passados na fase de requisitos
	private String empresario;
	private String titulo;
	private String descricao;
	private String link;

	public Projeto(String empresario, String titulo, String descricao, String link) {
		this.chave = Sha1Hex.makeSHA1Hash(empresario + titulo + descricao + link);

		this.empresario = empresario;
		this.titulo = titulo;
		this.descricao = descricao;
		this.link = link;
	}

	public String getChave() {
		return this.chave;
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
