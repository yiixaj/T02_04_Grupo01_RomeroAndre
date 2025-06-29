package com.minimercado.sgm.service;

import com.minimercado.sgm.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> listar();
    Usuario guardar(Usuario usuario);
}
