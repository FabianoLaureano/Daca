package com.qma.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AjudaOnline {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String matriculaAluno;
	
	@Column
	private String disciplina;	
	
	public AjudaOnline() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public AjudaOnline(int id, String matriculaAluno, String disciplina) {
		super();
		this.id = id;
		this.matriculaAluno = matriculaAluno;
		this.disciplina = disciplina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
