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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
		result = prime * result + Float.floatToIntBits(dinheiro_recebido);
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + nota;
		result = prime * result + ((proficiencia == null) ? 0 : proficiencia.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Tutor other = (Tutor) obj;
		if (codigoCurso == null) {
			if (other.codigoCurso != null)
				return false;
		} else if (!codigoCurso.equals(other.codigoCurso))
			return false;
		if (Float.floatToIntBits(dinheiro_recebido) != Float.floatToIntBits(other.dinheiro_recebido))
			return false;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nota != other.nota)
			return false;
		if (proficiencia == null) {
			if (other.proficiencia != null)
				return false;
		} else if (!proficiencia.equals(other.proficiencia))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	
	

}
