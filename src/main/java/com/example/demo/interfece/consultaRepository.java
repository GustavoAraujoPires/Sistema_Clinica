package com.example.demo.interfece;

import com.example.demo.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface consultaRepository extends JpaRepository<Consulta, Long> {
}
