package br.com.gethelp.aplicacao;

import java.sql.Date;

import br.com.curso.dao.CursoDAO;
import br.com.gethelp.model.Curso;

public class App {

	public static void main(String[] args) {
		CursoDAO cursoDao = new CursoDAO();
		Curso curso = new Curso();
		curso.setNome("Prof Maria Eduarda");
		curso.setDisciplina("Matemática");
		curso.setNivelDeEnsino("Basico");
		curso.setDataCadastro((java.sql.Date)new Date(0));
		
		cursoDao.save(curso);

	}

}
