package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Usuario;
import com.minimercado.sgm.service.UsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@Tag(name = "Usuarios", description = "Gestión de usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        return ResponseEntity.ok(usuarioService.listar());
    }

    @PostMapping
    public ResponseEntity<Usuario> guardar(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.guardar(usuario));
    }
}
