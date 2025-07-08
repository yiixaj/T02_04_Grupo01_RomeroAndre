package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Categoria;
import com.minimercado.sgm.repository.CategoriaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class CategoriaServiceTest {

    @Mock
    private CategoriaRepository categoriaRepository;

    @InjectMocks
    private CategoriaServiceImpl categoriaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listar_deberiaRetornarListaDeCategorias() {
        Categoria categoria = new Categoria();
        categoria.setNombre("Bebidas");

        when(categoriaRepository.findAll()).thenReturn(List.of(categoria));

        List<Categoria> resultado = categoriaService.listar();

        assertThat(resultado).isNotEmpty();
        assertThat(resultado.get(0).getNombre()).isEqualTo("Bebidas");
        verify(categoriaRepository, times(1)).findAll();
    }
    @Test
void guardar_deberiaRetornarCategoriaGuardada() {
    Categoria categoria = new Categoria();
    categoria.setNombre("Lácteos");

    when(categoriaRepository.save(any(Categoria.class))).thenReturn(categoria);

    Categoria resultado = categoriaService.guardar(categoria);

    assertThat(resultado).isNotNull();
    assertThat(resultado.getNombre()).isEqualTo("Lácteos");
    verify(categoriaRepository, times(1)).save(categoria);
}
@Test
void guardar_deberiaRetornarNullSiCategoriaEsNull() {
    when(categoriaRepository.save(any())).thenReturn(null);
    Categoria resultado = categoriaService.guardar(null);
    assertThat(resultado).isNull();
}

}
