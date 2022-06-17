package com.ceiba.pelicula.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class PeliculaDTO {
    private Long id;
    private String nombrePelicula;
    private String genero;
    private int duracion;
    private int anio;
    private String descripcion;
    private String director;
}
