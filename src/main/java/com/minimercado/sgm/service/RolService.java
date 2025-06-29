package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Rol;

import java.util.List;

public interface RolService {
    List<Rol> listar();
    Rol guardar(Rol rol);
}
