package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Venta;
import com.minimercado.sgm.repository.VentaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class VentaServiceTest {

    @Mock
    private VentaRepository ventaRepository;

    @InjectMocks
    private VentaServiceImpl ventaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listar_deberiaRetornarListaDeVentas() {
        Venta venta = new Venta();
        venta.setTotal(25.0);

        when(ventaRepository.findAll()).thenReturn(List.of(venta));

        List<Venta> resultado = ventaService.listar();

        assertThat(resultado).isNotEmpty();
        assertThat(resultado.get(0).getTotal()).isEqualTo(25.0);
    }
}
