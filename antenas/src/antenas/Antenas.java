package antenas;

import java.util.LinkedList;
import java.util.List;

public class Antenas {

	private List<Empresario> empresarios = new LinkedList<Empresario>();
	private List<CADI> cadis = new LinkedList<CADI>();
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private List<Professor> professores = new LinkedList<Professor>();
	private List<Projeto> projetos = new LinkedList<Projeto>();

	public void addEmpresario(Empresario emp) {
		empresarios.add(emp);
	}

	public void addCADI(CADI cadi) {
		cadis.add(cadi);
	}

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void addProfessor(Professor prof) {
		professores.add(prof);
	}

	public void addProjeto(Projeto proj) {
		projetos.add(proj);
	}

	public Projeto buscarProjetoPorChave(String chave) {
		for(Projeto projeto : projetos) {
			if(projeto.getChave().equals(chave)) return projeto;
		}
		return null;
	}

	//2. Implemente o metodo _(loginEmpresario)_ e seu metodo de dependencia _(compararDadosLogin)_
	public Empresario loginEmpresario(DadosLogin dl) {
		for(Empresario empresario : empresarios) {
			if(empresario.getDadosLogin().compararDadosLogin(dl)) return empresario;
		}
		return null;
	}

	public List<Empresario> getEmpresarios() {
		return empresarios;
	}
}
