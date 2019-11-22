package antenas;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

class testeempresario {

	@Test
	void test() {
	Antenas antenas = new Antenas();

	//Testar cadastro do Empresário
	assertEquals(antenas.getEmpresarios().size(), 0);
	antenas.addEmpresario(new Empresario("123", new DadosLogin("joao@gmail.com", "456")));
	assertEquals(antenas.getEmpresarios().size(), 1);

	// Testar login do Empresário
	antenas.addEmpresario(new Empresario("123", new DadosLogin("joao@gmail.com", "456")));
	Empresario emp = antenas.loginEmpresario(new DadosLogin("joao@gmail.com", "456"));
	assertEquals(emp.getCpf(), "123");

	//Testar cadastro de Aluno
	antenas.addAluno(new Aluno( new DadosLogin("tabatha.fatec@gmail.com", "tabatha123"), "Tabatha", "ads", "123456"));
	assertEquals(antenas.getAlunos().size(),1);

	//Testar login do Aluno
	antenas.addAluno(new Aluno(new DadosLogin("tabatha@gmail.com", "tabatha123"), "Tabatha", "ads", "1010"));
	Aluno aluno = antenas.loginAluno(new DadosLogin("tabatha@gmail.com", "tabatha123"));
	assertEquals(aluno.getRa(), "1010");

	//Testar cadastro de membro do CADI
	antenas.addCADI(new CADI(new DadosLogin("jean.fatec@gmail.com", "jean123"), "9090"));
	assertEquals(antenas.getCadis().size(),1);

	//Testar login do CADI
	antenas.addCADI(new CADI(new DadosLogin("jean.fatec@gmail.com", "jean123"), "9090"));
	CADI cadi = antenas.loginCADI(new DadosLogin("jean.fatec@gmail.com", "jean123"));
	assertEquals(cadi.getMatricula(), "9090");


	//Testar cadastro Professor
	antenas.addProfessor(new Professor(new DadosLogin("giuliano.fatec@gmail.com", "professor123"), "8080"));
	assertEquals(antenas.getProfessores().size(),1);


	//Testar Login do Professor
	antenas.addProfessor(new Professor(new DadosLogin("giuliano.fatec@gmail.com", "professor123"), "8080"));
	Professor professor = (Professor) antenas.loginProfessor(new DadosLogin("giuliano.fatec@gmail.com", "professor123"));
	assertEquals(professor.getMatricula(), "8080");

	// Testar cadastro e busca de Projeto
	try {
		Projeto projeto = new Projeto("bla", "bla", "bla", "bla");
		String chave = projeto.getChave();
		
		antenas.addProjeto(projeto);
		
		assertEquals(projeto.getChave(), antenas.buscarProjetoPorChave(chave).getChave());
	} catch (Exception e) {
		e.printStackTrace();
		assertEquals(1,2);
	}
}	
}