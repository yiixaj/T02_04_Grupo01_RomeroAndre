package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Caja;
import com.minimercado.sgm.repository.CajaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CajaServiceImpl implements CajaService {

    private final CajaRepository cajaRepository;

    public CajaServiceImpl(CajaRepository cajaRepository) {
        this.cajaRepository = cajaRepository;
    }

    @Override
    public List<Caja> listar() {
        return cajaRepository.findAll();
    }

    @Override
    public Caja guardar(Caja caja) {
        return cajaRepository.save(caja);
    }
}
