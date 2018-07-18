package com.qma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qma.models.AjudaOnline;
import com.qma.repository.AjudaOnlineRepository;

@Service
public class AjudaOnlineServiceImpl implements AjudaOnlineService {
	
	@Autowired
	private AjudaOnlineRepository ajudaOnlineRepository;

	@Override
	public void cadastraAjudaOnline(AjudaOnline ajuda) {
		ajudaOnlineRepository.save(ajuda);
	}

	@Override
	public List<AjudaOnline> findAllAjudaOnline() {
		return (List<AjudaOnline>) ajudaOnlineRepository.findAll(); 
	}

	@Override
	public AjudaOnline findById(int id) {
		return ajudaOnlineRepository.findById(id); 
	}

	@Override
	public AjudaOnline updateAjudaOnline(AjudaOnline nova_ajuda, AjudaOnline ajuda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAjudaOnline(AjudaOnline e) {
		// TODO Auto-generated method stub
		return null;
	}

}
