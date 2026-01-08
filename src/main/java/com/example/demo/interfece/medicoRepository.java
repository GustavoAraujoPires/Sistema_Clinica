package com.example.demo.interfece;

import com.example.demo.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface medicoRepository extends JpaRepository<Medico, Long> {
}
