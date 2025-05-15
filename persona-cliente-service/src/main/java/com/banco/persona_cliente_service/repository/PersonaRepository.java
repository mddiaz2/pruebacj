package com.banco.persona_cliente_service.repository;

import com.banco.persona_cliente_service.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, String> {
}
