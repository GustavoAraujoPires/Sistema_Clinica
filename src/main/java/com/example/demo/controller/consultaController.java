package com.example.demo.controller;

import com.example.demo.model.Consulta;
import com.example.demo.service.consultaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consultas")
public class consultaController {

    private final consultaService clinicaService;

    public consultaController(consultaService clinicaService) {
        this.clinicaService = clinicaService;
    }

    @GetMapping
    public List<Consulta> listarClinicas (){
        return clinicaService.listarTodasclinica();
    }

    @PostMapping
    public Consulta savarClinica (@RequestBody Consulta clinica){
        return clinicaService.savarclinica(clinica);
    }

    @GetMapping("/{id}")
    public Consulta buscarClinicasId (@PathVariable Long id){
        return clinicaService.burcarclinicaId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarClinicaId (@PathVariable Long id){
        clinicaService.deletarclinica(id);
    }
}
