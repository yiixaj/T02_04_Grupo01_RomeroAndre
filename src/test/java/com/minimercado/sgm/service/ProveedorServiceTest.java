package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Proveedor;
import com.minimercado.sgm.repository.ProveedorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ProveedorServiceTest {

    @Mock
    private ProveedorRepository proveedorRepository;

    @InjectMocks
    private ProveedorServiceImpl proveedorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listar_deberiaRetornarListaDeProveedores() {
        Proveedor proveedor = new Proveedor();
        proveedor.setNombre("Distribuidora XYZ");

        when(proveedorRepository.findAll()).thenReturn(List.of(proveedor));

        List<Proveedor> resultado = proveedorService.listar();

        assertThat(resultado).isNotEmpty();
        assertThat(resultado.get(0).getNombre()).isEqualTo("Distribuidora XYZ");
        verify(proveedorRepository, times(1)).findAll();
    }
    @Test
void guardar_deberiaRetornarProveedorGuardado() {
    Proveedor proveedor = new Proveedor();
    proveedor.setNombre("Proveedor ABC");

    when(proveedorRepository.save(Mockito.any(Proveedor.class))).thenReturn(proveedor);

    Proveedor resultado = proveedorService.guardar(proveedor);

    assertThat(resultado).isNotNull();
    assertThat(resultado.getNombre()).isEqualTo("Proveedor ABC");
    verify(proveedorRepository, times(1)).save(proveedor);
}
@Test
void guardar_deberiaRetornarNullSiProveedorEsNull() {
    when(proveedorRepository.save(any())).thenReturn(null);
    Proveedor resultado = proveedorService.guardar(null);
    assertThat(resultado).isNull();
}

}
