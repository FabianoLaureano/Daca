package com.qma.repository;

import org.springframework.data.repository.CrudRepository;

import com.qma.models.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

	Aluno findByMatricula(String matricula);
	
}
