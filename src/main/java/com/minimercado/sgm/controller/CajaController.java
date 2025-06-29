package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Caja;
import com.minimercado.sgm.service.CajaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/caja")
@Tag(name = "Caja", description = "Gestión de apertura y cierre de caja")
public class CajaController {

    private final CajaService cajaService;

    public CajaController(CajaService cajaService) {
        this.cajaService = cajaService;
    }

    @GetMapping
    public ResponseEntity<List<Caja>> listar() {
        return ResponseEntity.ok(cajaService.listar());
    }

    
}
