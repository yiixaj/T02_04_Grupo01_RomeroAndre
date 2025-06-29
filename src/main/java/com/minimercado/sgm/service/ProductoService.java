package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
    Producto guardar(Producto producto);
}
