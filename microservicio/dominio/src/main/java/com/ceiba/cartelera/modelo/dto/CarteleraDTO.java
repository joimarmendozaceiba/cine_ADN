package com.ceiba.cartelera.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class CarteleraDTO {
    private Long id;
    private String nombreMes;
    private int idPelicula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
}
