package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Rol;
import com.minimercado.sgm.service.RolService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@Tag(name = "Roles", description = "Gestión de roles de usuario")
public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public ResponseEntity<List<Rol>> listar() {
        return ResponseEntity.ok(rolService.listar());
    }

    @PostMapping
    public ResponseEntity<Rol> guardar(@RequestBody Rol rol) {
        return ResponseEntity.ok(rolService.guardar(rol));
    }
}
