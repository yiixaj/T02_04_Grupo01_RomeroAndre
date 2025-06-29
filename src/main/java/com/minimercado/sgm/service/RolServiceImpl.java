package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Rol;
import com.minimercado.sgm.repository.RolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;

    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public List<Rol> listar() {
        return rolRepository.findAll();
    }

    @Override
    public Rol guardar(Rol rol) {
        return rolRepository.save(rol);
    }
}
