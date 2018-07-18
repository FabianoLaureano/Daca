package com.qma.services;

import java.util.List;

import com.qma.models.AjudaOnline;

public interface AjudaOnlineService {
	
	//post - create
	void cadastraAjudaOnline(AjudaOnline ajuda);
				
	//get all - read
	List<AjudaOnline> findAllAjudaOnline();
				
	//get matricula - read
	AjudaOnline findById(int id);
				
	//put
	AjudaOnline updateAjudaOnline(AjudaOnline nova_ajuda, AjudaOnline ajuda);
				
	//delete
	String deleteAjudaOnline(AjudaOnline e);

}
