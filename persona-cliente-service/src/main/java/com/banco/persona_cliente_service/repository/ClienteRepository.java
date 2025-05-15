package com.banco.persona_cliente_service.repository;

import com.banco.persona_cliente_service.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}

