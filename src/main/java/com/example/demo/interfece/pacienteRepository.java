package com.example.demo.interfece;

import com.example.demo.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pacienteRepository extends JpaRepository <Paciente,Long> {
}
