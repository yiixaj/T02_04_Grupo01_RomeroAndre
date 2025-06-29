package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Venta;

import java.util.List;

public interface VentaService {
    List<Venta> listar();
    Venta guardar(Venta venta);
}
