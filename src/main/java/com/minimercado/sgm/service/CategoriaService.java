package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> listar();
    Categoria guardar(Categoria categoria);
}
