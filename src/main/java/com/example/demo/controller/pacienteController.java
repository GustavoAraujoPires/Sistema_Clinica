package com.example.demo.controller;

import com.example.demo.model.Paciente;
import com.example.demo.service.pacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class pacienteController {

    private final pacienteService pacienteService;

    public pacienteController(pacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> listarTodosPacientes(){
        return pacienteService.listarTodosPaciente();
    }

    @PostMapping
    public Paciente savarPaciente(@RequestBody Paciente paciente){
        return pacienteService.savarPaciente(paciente);
    }

    @GetMapping("/{id}")
    public Paciente buscarPacienteporId(@PathVariable Long id){
        return pacienteService.burcarPacienteId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPacientePorId (@PathVariable Long id){
        pacienteService.deletarPaciente(id);
    }

}
