package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Cliente;
import com.minimercado.sgm.repository.ClienteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ClienteServiceTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteServiceImpl clienteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listar_deberiaRetornarListaDeClientes() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");

        when(clienteRepository.findAll()).thenReturn(List.of(cliente));

        List<Cliente> resultado = clienteService.listar();

        assertThat(resultado).isNotEmpty();
        assertThat(resultado.get(0).getNombre()).isEqualTo("Juan Pérez");
        verify(clienteRepository, times(1)).findAll();
    }
    @Test
void guardar_deberiaRetornarClienteGuardado() {
    Cliente cliente = new Cliente();
    cliente.setNombre("Carlos");

    when(clienteRepository.save(any(Cliente.class))).thenReturn(cliente);

    Cliente resultado = clienteService.guardar(cliente);

    assertThat(resultado).isNotNull();
    assertThat(resultado.getNombre()).isEqualTo("Carlos");
}

}
