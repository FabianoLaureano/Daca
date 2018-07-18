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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + id;
		result = prime * result + ((matriculaAluno == null) ? 0 : matriculaAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AjudaOnline other = (AjudaOnline) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (id != other.id)
			return false;
		if (matriculaAluno == null) {
			if (other.matriculaAluno != null)
				return false;
		} else if (!matriculaAluno.equals(other.matriculaAluno))
			return false;
		return true;
	}
	
	

}
