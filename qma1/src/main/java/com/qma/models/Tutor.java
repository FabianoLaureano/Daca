package com.qma.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tutor {
	
	@Id
	private int matricula;
	
	@Column
	private String disciplina;
	
	@Column
	private String proficiencia;
	
	@Column
	private String nome;
	
	@Column
	private String codigoCurso;
	
	@Column
	private String telefone;	
	
	@Column
	private String email;
	
	@Column
	private float dinheiro_recebido;
	
	@Column
	private int nota = 4;
	
	//@Column
	//private List<String> horarios; 
	
	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tutor(int matricula, String disciplina, String proficiencia, String nome, String codigoCurso,
			String telefone, String email, float dinheiro_recebido) {
		super();
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.proficiencia = proficiencia;
		this.nome = nome;
		this.codigoCurso = codigoCurso;
		this.telefone = telefone;
		this.email = email;
		this.dinheiro_recebido = dinheiro_recebido;
	}

	/*public List<String> getHorarios() {
		return horarios;
	}

	public void addHorarios(String horario) {
		horarios.add(horario);
	}*/

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getDinheiro_recebido() {
		return dinheiro_recebido;
	}

	public void setDinheiro_recebido(float dinheiro_recebido) {
		this.dinheiro_recebido = dinheiro_recebido;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
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
