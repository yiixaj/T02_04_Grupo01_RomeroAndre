package com.minimercado.sgm.repository;

import com.minimercado.sgm.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
