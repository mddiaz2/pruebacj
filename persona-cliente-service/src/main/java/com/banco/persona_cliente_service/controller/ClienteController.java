package com.banco.persona_cliente_service.controller;

import com.banco.persona_cliente_service.entity.Cliente;
import com.banco.persona_cliente_service.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteService.crearCliente(cliente);
    }

    @GetMapping("/{identificacion}")
    public Cliente obtenerCliente(@PathVariable String identificacion) {
        return clienteService.obtenerCliente(identificacion);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteService.listarClientes();
        clientes.forEach(System.out::println);
        return clientes;
    }


    @DeleteMapping("/{identificacion}")
    public void eliminarCliente(@PathVariable String identificacion) {
        clienteService.eliminarCliente(identificacion);
    }
}
