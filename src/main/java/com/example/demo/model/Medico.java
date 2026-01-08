package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String data_nacimento;
    private  String especialidade;

    public Medico(){}

    public Medico(Long id, String name, String data_nacimento, String especialidade) {
        this.id = id;
        this.name = name;
        this.data_nacimento = data_nacimento;
        this.especialidade = especialidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData_nacimento() {
        return data_nacimento;
    }

    public void setData_nacimento(String data_nacimento) {
        this.data_nacimento = data_nacimento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
