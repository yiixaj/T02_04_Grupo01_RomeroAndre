package com.minimercado.sgm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "caja")
@Getter
@Setter
public class Caja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime apertura;
    private LocalDateTime cierre;

    private Double montoInicial;
    private Double montoFinal;
}
