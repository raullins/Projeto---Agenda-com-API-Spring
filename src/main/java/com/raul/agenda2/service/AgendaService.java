package com.raul.agenda2.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raul.agenda2.model.AgendaModel;
import com.raul.agenda2.repository.AgendaRepository;

@Service
public class AgendaService {

    @Autowired
    AgendaRepository agendaRepository;

    public AgendaModel save(AgendaModel agendaModel) {
        return agendaRepository.save(agendaModel);
    }

    public List<AgendaModel> getAll() {
        return agendaRepository.findAll();
    }

    public Optional<AgendaModel> findById(UUID id) {
        return agendaRepository.findById(id);
    }

    public void delete(AgendaModel agendaModel) {
        agendaRepository.delete(agendaModel);
    }
    


}
