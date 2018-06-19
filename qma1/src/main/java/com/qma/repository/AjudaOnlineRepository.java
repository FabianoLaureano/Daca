package com.qma.repository;

import org.springframework.data.repository.CrudRepository;

import com.qma.models.AjudaOnline;

public interface AjudaOnlineRepository extends CrudRepository<AjudaOnline, Integer> {
	
	AjudaOnline findById(int id);

}
