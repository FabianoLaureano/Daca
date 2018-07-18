package com.qma.services;

import java.util.List;

import com.qma.models.Aluno;

public interface AlunoService {
	
	//post - create
	void cadastraAluno(Aluno aluno);
		
	//get all - read
	List<Aluno> findAllAluno();
		
	//get matricula - read
	Aluno findByMatricula(String matricula);
		
	//put
	Aluno updateAluno(Aluno novo_aluno, Aluno aluno);
		
	//delete
	String deleteAluno(Aluno e);

}
