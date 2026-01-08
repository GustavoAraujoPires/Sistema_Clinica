package com.example.demo.controller;

import com.example.demo.model.Medico;
import com.example.demo.service.medicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class medicoController {

    private final medicoService medicoService;

    public medicoController(medicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public List<Medico> listarTodosMedico (){
        return medicoService.listarTodosmedico();
    }

    @GetMapping("/{id}")
    public Medico BuscarMedicoPorId(@PathVariable Long id){
        return medicoService.burcarmedicoId(id);
    }

    @PostMapping
    public Medico savarMedico (@RequestBody Medico medico){
        return medicoService.savarmedico(medico);
    }

    @DeleteMapping("/{id}")
    public void deletarMedico (@PathVariable Long id){
        medicoService.deletarmedico(id);
    }
}
