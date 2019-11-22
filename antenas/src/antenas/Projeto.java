package antenas;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Projeto {
	private String chave;
	//acrescentar todos os demais atributos do projeto que foram passados na fase de requisitos
	private String empresario;
	private String titulo;
	private String descricao;
	private String link;

	public Projeto(String empresario, String titulo, String descricao, String link) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		this.chave = Sha1Hex.makeSHA1Hash(empresario + titulo + descricao + link);

		this.empresario = empresario;
		this.titulo = titulo;
		this.descricao = descricao;
		this.link = link;
	}

	public String getChave() {
		return this.chave;
	}
	
	public String setChave(String chave) {
		return this.chave = chave;
	}
	
	public String getEmpresario() {
		return this.empresario;
	}

	public String setEmpresario(String empresario) {
		return this.empresario = empresario;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String setTitulo(String titulo) {
		return this.titulo = titulo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public String setDescricao(String descricao) {
		return this.descricao = descricao;
	}

	public String getLink() {
		return this.link;
	}

	public String setLink(String link) {
		return this.link = link;
	}
}