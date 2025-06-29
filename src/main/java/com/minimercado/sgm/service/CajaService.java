package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Caja;

import java.util.List;

public interface CajaService {
    List<Caja> listar();
    Caja guardar(Caja caja);
}
