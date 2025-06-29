package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Cliente;
import com.minimercado.sgm.service.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@Tag(name = "Clientes", description = "Gestión de clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        return ResponseEntity.ok(clienteService.listar());
    }

    @PostMapping
    public ResponseEntity<Cliente> guardar(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.guardar(cliente));
    }
}
