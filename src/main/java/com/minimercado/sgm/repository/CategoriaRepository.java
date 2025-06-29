package com.minimercado.sgm.repository;

import com.minimercado.sgm.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
