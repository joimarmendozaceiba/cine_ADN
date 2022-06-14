package com.ceiba.pelicula.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoPelicula {
    private Long id;
    private String nombrePelicula;
    private String genero;
    private int duracion;
    private LocalDateTime año;
    private String descripcion;
    private String director;

}
