package antenas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAntenas {

	@Test
	void adicionaEmpresarioParaAListaDeProjetos() {
		Antenas antenas = new Antenas();

		assertEquals(antenas.getEmpresarios().size(), 0);

		antenas.addEmpresario(new Empresario("123", new DadosLogin("joao@gmail.com", "456")));
		antenas.addEmpresario(new Empresario("321", new DadosLogin("maria@gmail.com", "654")));

		assertEquals(antenas.getEmpresarios().size(), 2);
	}

	@Test
	void AnAddedEmpresarioIsReturnedWhenLoginIsCalledWithTheRightLoginData() {
		Antenas antenas = new Antenas();

		antenas.addEmpresario(new Empresario("123", new DadosLogin("joao@gmail.com", "456")));

		Empresario emp = antenas.loginEmpresario(new DadosLogin("joao@gmail.com", "456"));

		assertEquals(emp.getCpf(), "123");
	}

	@Test
	void returnTheCorrectProjectWhenSearchingByChave() {
		Antenas antenas = new Antenas();

		antenas.addProjeto(new Projeto("abc"));

		Projeto projeto = antenas.buscarProjetoPorChave("abc");

		assertEquals(projeto.getChave(), "abc");
	}
}
