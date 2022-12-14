package br.com.gethelp.model;

import java.util.Date;

public class Curso {
	public int idCurso;
	private String nome;
    private String disciplina;
    private String nivelDeEnsino;
    private Date dataCadastro;
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getNivelDeEnsino() {
		return nivelDeEnsino;
	}
	public void setNivelDeEnsino(String nivelDeEnsino) {
		this.nivelDeEnsino = nivelDeEnsino;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
    
}
