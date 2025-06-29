package com.minimercado.sgm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    private String descripcion;

    @Column(nullable = false)
    private Double precio;

    @Column(nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
