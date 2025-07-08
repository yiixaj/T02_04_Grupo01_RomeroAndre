package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Producto;
import com.minimercado.sgm.repository.ProductoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoServiceImpl productoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listar_deberiaRetornarListaDeProductos() {
        Producto producto = new Producto();
        producto.setNombre("Arroz");

        when(productoRepository.findAll()).thenReturn(List.of(producto));

        List<Producto> resultado = productoService.listar();

        assertThat(resultado).isNotEmpty();
        assertThat(resultado.get(0).getNombre()).isEqualTo("Arroz");
        verify(productoRepository, times(1)).findAll();
    }
    @Test
void guardar_deberiaRetornarProductoGuardado() {
    Producto producto = new Producto();
    producto.setNombre("Jugo");

    when(productoRepository.save(any(Producto.class))).thenReturn(producto);

    Producto resultado = productoService.guardar(producto);

    assertThat(resultado).isNotNull();
    assertThat(resultado.getNombre()).isEqualTo("Jugo");
}
@Test
void listar_deberiaRetornarListaVaciaSiNoHayProductos() {
    when(productoRepository.findAll()).thenReturn(List.of());
    List<Producto> resultado = productoService.listar();
    assertThat(resultado).isEmpty();
}

}
