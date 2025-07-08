package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Usuario;
import com.minimercado.sgm.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioServiceImpl usuarioService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listar_deberiaRetornarListaDeUsuarios() {
        Usuario usuario = new Usuario();
        usuario.setNombre("admin");

        when(usuarioRepository.findAll()).thenReturn(List.of(usuario));

        List<Usuario> resultado = usuarioService.listar();

        assertThat(resultado).isNotEmpty();
        assertThat(resultado.get(0).getNombre()).isEqualTo("admin");
        verify(usuarioRepository, times(1)).findAll();
    }
    @Test
void guardar_deberiaRetornarUsuarioGuardado() {
    Usuario usuario = new Usuario();
    usuario.setNombre("admin");

    when(usuarioRepository.save(any(Usuario.class))).thenReturn(usuario);

    Usuario resultado = usuarioService.guardar(usuario);

    assertThat(resultado).isNotNull();
    assertThat(resultado.getNombre()).isEqualTo("admin");
}

}
