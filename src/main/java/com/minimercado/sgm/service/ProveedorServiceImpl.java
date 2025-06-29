package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Proveedor;
import com.minimercado.sgm.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public List<Proveedor> listar() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor guardar(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }
}
