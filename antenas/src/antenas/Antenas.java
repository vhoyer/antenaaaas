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


	public Professor loginProfessor(DadosLogin dl) {
		for(Professor professor : professores) {
			if(professor.getDadosLogin().compararDadosLogin(dl)) return professor;
		}
		return null;
	}

	public Empresario loginEmpresario(DadosLogin dl) {
		for(Empresario empresario : empresarios) {
			if(empresario.getDadosLogin().compararDadosLogin(dl)) return empresario;
		}
		return null;
	}

	public Empresario loginEmpresario(DadosLogin dl) {
		for(Empresario empresario : empresarios) {
			if(empresario.getDadosLogin().compararDadosLogin(dl)) return empresario;
		}
		return null;
	}
	public Aluno loginAluno(DadosLogin dl) {
		for(Aluno aluno : alunos) {
			if(aluno.getDadosLogin().compararDadosLogin(dl)) return aluno;
		}
		return null;
	}
	
	public CADI loginCADI(DadosLogin dl) {
		for(CADI cadi : cadis) {
			if(cadi.getDadosLogin().compararDadosLogin(dl)) return cadi;
		}
		return null;
	}
	
	public Professor loginProfessor(DadosLogin dl) {
		for(Professor prof : professores) {
			if(prof.getDadosLogin().compararDadosLogin(dl)) return prof;
		}
		return null;
	}

	public Empresario loginEmpresario(DadosLogin dl) {
		for(Empresario empresario : empresarios) {
			if(empresario.getDadosLogin().compararDadosLogin(dl)) return empresario;
		}
		return null;
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
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public List<CADI> getCadis() {
		return cadis;
	}
	
	public List<Professor> getProfessores() {
		return professores;
	}
	
	public List<Projeto> getProjetos() {
		return projetos;
	}
}
