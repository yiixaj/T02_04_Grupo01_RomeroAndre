package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Proveedor;
import com.minimercado.sgm.service.ProveedorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
@Tag(name = "Proveedores", description = "Gestión de proveedores")
public class ProveedorController {

    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public ResponseEntity<List<Proveedor>> listar() {
        return ResponseEntity.ok(proveedorService.listar());
    }

    @PostMapping
    public ResponseEntity<Proveedor> guardar(@RequestBody Proveedor proveedor) {
        return ResponseEntity.ok(proveedorService.guardar(proveedor));
    }
}
