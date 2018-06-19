package com.qma.repository;

import org.springframework.data.repository.CrudRepository;

import com.qma.models.Tutor;

public interface TutorRepository extends CrudRepository<Tutor, Integer> {
	
	Tutor findByMatricula(int matricula);

}
