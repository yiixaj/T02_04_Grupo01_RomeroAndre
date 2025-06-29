package com.minimercado.sgm.service;

import com.minimercado.sgm.model.OrdenCompra;
import com.minimercado.sgm.repository.OrdenCompraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenCompraServiceImpl implements OrdenCompraService {

    private final OrdenCompraRepository ordenCompraRepository;

    public OrdenCompraServiceImpl(OrdenCompraRepository ordenCompraRepository) {
        this.ordenCompraRepository = ordenCompraRepository;
    }

    @Override
    public List<OrdenCompra> listar() {
        return ordenCompraRepository.findAll();
    }

    @Override
    public OrdenCompra guardar(OrdenCompra ordenCompra) {
        return ordenCompraRepository.save(ordenCompra);
    }
}
