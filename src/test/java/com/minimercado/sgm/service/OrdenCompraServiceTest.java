package com.minimercado.sgm.service;

import com.minimercado.sgm.model.OrdenCompra;
import com.minimercado.sgm.repository.OrdenCompraRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.time.LocalDate;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class OrdenCompraServiceTest {

    @Mock
    private OrdenCompraRepository ordenCompraRepository;

    @InjectMocks
    private OrdenCompraServiceImpl ordenCompraService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listar_deberiaRetornarListaDeOrdenes() {
        OrdenCompra orden = new OrdenCompra();
        orden.setFecha(LocalDate.now());
        orden.setEstado("PENDIENTE");

        when(ordenCompraRepository.findAll()).thenReturn(List.of(orden));

        List<OrdenCompra> resultado = ordenCompraService.listar();

        assertThat(resultado).isNotEmpty();
        assertThat(resultado.get(0).getEstado()).isEqualTo("PENDIENTE");
        verify(ordenCompraRepository, times(1)).findAll();
    }
    @Test
void guardar_deberiaRetornarOrdenCompraGuardada() {
    OrdenCompra orden = new OrdenCompra();
    orden.setEstado("PENDIENTE");

    when(ordenCompraRepository.save(any(OrdenCompra.class))).thenReturn(orden);

    OrdenCompra resultado = ordenCompraService.guardar(orden);

    assertThat(resultado).isNotNull();
    assertThat(resultado.getEstado()).isEqualTo("PENDIENTE");
}

}
