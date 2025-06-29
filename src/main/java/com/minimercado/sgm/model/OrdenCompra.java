package com.minimercado.sgm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "ordenes_compra")
@Getter
@Setter
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    @Column(nullable = false)
    private String estado;  // Ejemplo: "PENDIENTE", "RECIBIDA", "CANCELADA"

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private Proveedor proveedor;
}
