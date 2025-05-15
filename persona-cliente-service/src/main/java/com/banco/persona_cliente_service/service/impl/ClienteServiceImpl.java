package com.banco.persona_cliente_service.service.impl;

import com.banco.persona_cliente_service.entity.Cliente;
import com.banco.persona_cliente_service.repository.ClienteRepository;
import com.banco.persona_cliente_service.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente obtenerCliente(String identificacion) {
        return clienteRepository.findById(identificacion)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public void eliminarCliente(String identificacion) {
        clienteRepository.deleteById(identificacion);
    }
}
