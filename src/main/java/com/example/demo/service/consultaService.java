package com.example.demo.service;

import com.example.demo.interfece.consultaRepository;
import com.example.demo.model.Consulta;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class consultaService {

    private final consultaRepository clinicaRepository;

    public consultaService(consultaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;
    }
    
    public List<Consulta> listarTodasclinica(){
        return clinicaRepository.findAll();
    }

    public Consulta savarclinica (Consulta clinica){
        return clinicaRepository.save(clinica);
    }

    public Consulta burcarclinicaId(Long id){
        return clinicaRepository.findById(id).orElse(null);
    }

    public void deletarclinica (long id){
        clinicaRepository.deleteById(id);
    }
}
