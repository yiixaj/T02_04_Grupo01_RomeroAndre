package com.minimercado.sgm.service;

import com.minimercado.sgm.model.OrdenCompra;

import java.util.List;

public interface OrdenCompraService {
    List<OrdenCompra> listar();
    OrdenCompra guardar(OrdenCompra ordenCompra);
}
