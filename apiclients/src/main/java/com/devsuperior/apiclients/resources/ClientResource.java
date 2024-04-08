package com.devsuperior.apiclients.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.apiclients.entities.Client;
import com.devsuperior.apiclients.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	
	@Autowired
	private ClientService service;
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Client> findById(@PathVariable Long id){
		Client entity = service.findById(id);
		return ResponseEntity.ok().body(entity);
	}
}
