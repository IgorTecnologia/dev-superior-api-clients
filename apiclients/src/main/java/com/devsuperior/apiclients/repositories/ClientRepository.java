package com.devsuperior.apiclients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.apiclients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
