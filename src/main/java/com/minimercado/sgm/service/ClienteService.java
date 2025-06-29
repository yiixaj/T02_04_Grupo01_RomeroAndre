package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> listar();
    Cliente guardar(Cliente cliente);
}
