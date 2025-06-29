package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Proveedor;

import java.util.List;

public interface ProveedorService {
    List<Proveedor> listar();
    Proveedor guardar(Proveedor proveedor);
}
