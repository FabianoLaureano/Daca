package com.qma.services;

import java.util.List;

import com.qma.models.Tutor;

public interface TutorService {
	
		//post - create
		void cadastraTutor(Tutor tutor);
			
		//get all - read
		List<Tutor> findAllTutor();
			
		//get matricula - read
		Tutor findByMatricula(int matricula);
			
		//put
		Tutor updateTutor(Tutor novo_tutor, Tutor tutor);
			
		//delete
		String deleteTutor(Tutor e);

}
