package com.devsuperior.apiclients.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.apiclients.dto.ClientDTO;
import com.devsuperior.apiclients.entities.Client;
import com.devsuperior.apiclients.repositories.ClientRepository;
import com.devsuperior.apiclients.services.exceptions.DataBaseException;
import com.devsuperior.apiclients.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
		Page<Client> list = repository.findAll(pageRequest);
		return list.map(x -> new ClientDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id){
		Optional <Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found: " + id));
		return new ClientDTO(entity);
	}
	
	public ClientDTO insert(ClientDTO dto){
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
		
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}
	
	public ClientDTO update(Long id, ClientDTO dto) {
		try {
			Client entity = repository.getOne(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new ClientDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("Entity not found: " + id);
		}
		
	}
	
	private void copyDtoToEntity(ClientDTO dto, Client entity) {
		
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
		
	}
	
	public void delete(@PathVariable Long id) {
		try {
		repository.deleteById(id);
		
	}catch(EmptyResultDataAccessException e) {
		throw new ResourceNotFoundException("Entity not found " + id);
	}
	catch(DataIntegrityViolationException e) {
		throw new DataBaseException("Integrity violation");
	}
	}
}
