package com.raul.agenda2.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raul.agenda2.model.AgendaModel;



public interface AgendaRepository extends JpaRepository<AgendaModel, UUID>{
    
}
