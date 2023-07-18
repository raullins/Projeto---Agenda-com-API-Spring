package com.raul.agenda2.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raul.agenda2.model.AgendaModel;
import com.raul.agenda2.service.AgendaService;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
    
    @Autowired
    AgendaService agendaService;

    @PostMapping("/save")
    public AgendaModel saveAgenda(@RequestBody AgendaModel agendaModel){
        return agendaService.save(agendaModel);
    
    }

    @GetMapping("/allAgenda")
    public List<AgendaModel> getAllAgenda(){
        return agendaService.getAll();
    }

    @DeleteMapping("/{id}")
    public String deleteAgenda(@PathVariable(value = "id") UUID id){
       Optional<AgendaModel> agendaModelOptional = agendaService.findById(id);
       if (!agendaModelOptional.isPresent()){
        return ("Agenda não encontrada");
       }
       agendaService.delete(agendaModelOptional.get());
       return ("Agenda deletada com sucesso");
    
    }
}
