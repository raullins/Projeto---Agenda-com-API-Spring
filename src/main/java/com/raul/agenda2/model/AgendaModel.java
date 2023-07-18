package com.raul.agenda2.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AGENDA")
public class AgendaModel {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 50)
    private String donoAgenda;

    @Column(nullable = false, unique = true, length = 50)
    private String emailDonoAgenda;

    @Column(nullable = false, length = 3)
    private int numMaterias;
    
    @Column(nullable = false, length = 50)
    private String estudandoAgora;

    @Column(nullable = false, length = 50)
    private String proxEstudar;

    @Column(nullable = false, length = 50)
    private String ultimaEstudada;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDonoAgenda() {
        return donoAgenda;
    }

    public void setDonoAgenda(String donoAgenda) {
        this.donoAgenda = donoAgenda;
    }

    public String getEmailDonoAgenda() {
        return emailDonoAgenda;
    }

    public void setEmailDonoAgenda(String emailDonoAgenda) {
        this.emailDonoAgenda = emailDonoAgenda;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public String getEstudandoAgora() {
        return estudandoAgora;
    }

    public void setEstudandoAgora(String estudandoAgora) {
        this.estudandoAgora = estudandoAgora;
    }

    public String getProxEstudar() {
        return proxEstudar;
    }

    public void setProxEstudar(String proxEstudar) {
        this.proxEstudar = proxEstudar;
    }

    public String getUltimaEstudada() {
        return ultimaEstudada;
    }

    public void setUltimaEstudada(String ultimaEstudada) {
        this.ultimaEstudada = ultimaEstudada;
    }

}
