package com.devsuperior.apiclients.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.ResourceAccessException;

import com.devsuperior.apiclients.entities.Client;
import com.devsuperior.apiclients.repositories.ClientRepository;
import com.devsuperior.apiclients.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<Client> findAll(){
		return repository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Client findById(Long id){
		Optional <Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found " + id));
		return entity;
	}
}
