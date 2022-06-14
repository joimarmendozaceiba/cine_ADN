package com.ceiba.cartelera.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoCartelera {
    private Long id;
    private String nombreMes;
    private int id_pelicula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
}
