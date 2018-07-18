package com.qma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qma.models.Aluno;
import com.qma.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunoRepository alunorepository;

	@Override
	public void cadastraAluno(Aluno aluno) {
		alunorepository.save(aluno);
	}

	@Override
	public List<Aluno> findAllAluno() {
		return (List<Aluno>) alunorepository.findAll();
	}

	public Aluno findByMatricula(String matricula) {
		return alunorepository.findByMatricula(matricula);
	}

	@Override
	public Aluno updateAluno(Aluno novo_aluno, Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAluno(Aluno e) {
		// TODO Auto-generated method stub
		return null;
	}

}
