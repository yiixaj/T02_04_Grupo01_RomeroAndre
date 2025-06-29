package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Categoria;
import com.minimercado.sgm.service.CategoriaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@Tag(name = "Categorías", description = "Gestión de categorías de productos")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listar() {
        return ResponseEntity.ok(categoriaService.listar());
    }

    @PostMapping
    public ResponseEntity<Categoria> guardar(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaService.guardar(categoria));
    }
}
