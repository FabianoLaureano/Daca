package com.qma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qma.models.Tutor;
import com.qma.repository.TutorRepository;

@Service
public class TutorServiceImpl implements TutorService {
	
	@Autowired
	private TutorRepository tutorRepository;

	@Override
	public void cadastraTutor(Tutor tutor) {
		tutorRepository.save(tutor);
	}

	@Override
	public List<Tutor> findAllTutor() {
		return (List<Tutor>) tutorRepository.findAll();
	}

	@Override
	public Tutor findByMatricula(int matricula) {
		return tutorRepository.findByMatricula(matricula);
	}

	@Override
	public Tutor updateTutor(Tutor novo_tutor, Tutor tutor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTutor(Tutor e) {
		// TODO Auto-generated method stub
		return null;
	}

}
