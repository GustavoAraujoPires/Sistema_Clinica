package com.example.demo.service;

import com.example.demo.interfece.pacienteRepository;
import com.example.demo.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class pacienteService {

    private final pacienteRepository pacienteRepository;

    public pacienteService(pacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> listarTodosPaciente(){
        return pacienteRepository.findAll();
    }

    public Paciente savarPaciente (Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public Paciente burcarPacienteId(Long id){
        return pacienteRepository.findById(id).orElse(null);
    }

    public void deletarPaciente (long id){
        pacienteRepository.deleteById(id);
    }
}
