package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Caja;
import com.minimercado.sgm.repository.CajaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class CajaServiceTest {

    @Mock
    private CajaRepository cajaRepository;

    @InjectMocks
    private CajaServiceImpl cajaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void guardar_deberiaRetornarCajaGuardada() {
        Caja caja = new Caja();
        caja.setMontoInicial(100.0);

        when(cajaRepository.save(any(Caja.class))).thenReturn(caja);

        Caja resultado = cajaService.guardar(caja);

        assertThat(resultado).isNotNull();
        assertThat(resultado.getMontoInicial()).isEqualTo(100.0);
    }
}
