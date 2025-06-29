package com.minimercado.sgm.repository;

import com.minimercado.sgm.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
