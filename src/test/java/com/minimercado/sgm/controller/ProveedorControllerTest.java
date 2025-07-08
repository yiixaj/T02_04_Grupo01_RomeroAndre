package com.minimercado.sgm.controller;

import com.minimercado.sgm.model.Proveedor;
import com.minimercado.sgm.service.ProveedorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProveedorController.class)
class ProveedorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    
    private ProveedorService proveedorService;

    @Test
    void listar_deberiaRetornarListaDeProveedores() throws Exception {
        Proveedor proveedor = new Proveedor();
        proveedor.setId(1L);
        proveedor.setNombre("Distribuidora 123");

        when(proveedorService.listar()).thenReturn(List.of(proveedor));

        mockMvc.perform(get("/api/proveedores")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nombre").value("Distribuidora 123"));
    }
}
