package com.qma.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tutor2 {
	
	@Id
	private int matricula;
	
	@Column
	private String disciplina;
	
	@Column
	private String proficiencia;
	
	/*public Tutor2() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Tutor2(String matricula, String disciplina, String proficiencia) {
		super();
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.proficiencia = proficiencia;
	}*/

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getProficiencia() {
		return proficiencia;
	}

	public void setProficiencia(String proficiencia) {
		this.proficiencia = proficiencia;
	}
	
	
		
}
