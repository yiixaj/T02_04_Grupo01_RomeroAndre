package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Producto;
import com.minimercado.sgm.service.ProductoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@Tag(name = "Productos", description = "Gestión de productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(productoService.listar());
    }

    @PostMapping
    public ResponseEntity<Producto> guardar(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.guardar(producto));
    }
}
