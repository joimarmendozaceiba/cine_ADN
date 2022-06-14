package com.ceiba.pelicula.modelo.entidad;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Pelicula {
    private Long id;
    private String nombrePelicula;
    private String genero;
    private int duracion;
    private LocalDateTime año;
    private String descripcion;
    private String director;

    public Pelicula(Long id, String nombrePelicula, String genero, int duracion, LocalDateTime año, String descripcion, String director) {

        this.id = id;
        this.nombrePelicula = nombrePelicula;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.descripcion = descripcion;
        this.director = director;
    }
}
