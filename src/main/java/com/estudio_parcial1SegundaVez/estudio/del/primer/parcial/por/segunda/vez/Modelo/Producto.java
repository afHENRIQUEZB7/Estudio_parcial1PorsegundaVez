package com.estudio_parcial1SegundaVez.estudio.del.primer.parcial.por.segunda.vez.Modelo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "productos")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private  String nombre;
    @Column(nullable = false, length = 300)
    private String descripcion;
    @Column(nullable = false)
    private Double valor;
    private String empresa;
}
