package com.example.demo.service;

import com.example.demo.interfece.medicoRepository;
import com.example.demo.model.Medico;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class medicoService {

    private final medicoRepository medicoRepository;

    public medicoService(medicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }
    
    public List<Medico> listarTodosmedico(){
        return medicoRepository.findAll();
    }

    public Medico savarmedico (Medico medico){
        return medicoRepository.save(medico);
    }

    public Medico burcarmedicoId(Long id){
        return medicoRepository.findById(id).orElse(null);
    }

    public void deletarmedico (long id){
        medicoRepository.deleteById(id);
    }
}
