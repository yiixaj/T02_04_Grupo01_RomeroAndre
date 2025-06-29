package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Venta;
import com.minimercado.sgm.service.VentaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
@Tag(name = "ventas", description = "Gestión de ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping
    public ResponseEntity<List<Venta>> listar() {
        return ResponseEntity.ok(ventaService.listar());
    }

    @PostMapping
    public ResponseEntity<Venta> guardar(@RequestBody Venta venta) {
        return ResponseEntity.ok(ventaService.guardar(venta));
    }
}
