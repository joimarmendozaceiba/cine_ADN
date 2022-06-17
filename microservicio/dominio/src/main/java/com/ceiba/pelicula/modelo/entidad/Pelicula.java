package com.ceiba.pelicula.modelo.entidad;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Pelicula {
    private Long id;
    private String nombrePelicula;
    private String genero;
    private int duracion;
    private int anio;
    private String descripcion;
    private String director;

    public Pelicula(Long id, String nombrePelicula, String genero, int duracion, int anio, String descripcion, String director) {

        this.id = id;
        this.nombrePelicula = nombrePelicula;
        this.genero = genero;
        this.duracion = duracion;
        this.anio = anio;
        this.descripcion = descripcion;
        this.director = director;
    }
}
