package com.banco.persona_cliente_service.service;

import com.banco.persona_cliente_service.entity.Cliente;
import java.util.List;

public interface ClienteService {
    Cliente crearCliente(Cliente cliente);
    Cliente obtenerCliente(String identificacion);
    List<Cliente> listarClientes();
    void eliminarCliente(String identificacion);
}