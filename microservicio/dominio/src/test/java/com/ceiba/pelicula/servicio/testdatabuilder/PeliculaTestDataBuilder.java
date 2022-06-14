package com.ceiba.pelicula.servicio.testdatabuilder;

import com.ceiba.pelicula.modelo.entidad.Pelicula;

import java.time.LocalDateTime;

public class PeliculaTestDataBuilder {

    private Long id;
    private String nombrePelicula;
    private String genero;
    private int duracion;
    private LocalDateTime año;
    private String descripcion;
    private String director;

    public PeliculaTestDataBuilder() {
        id = 1L;
        nombrePelicula = "Avalancha en el aire";
        genero = "suspenso";
        duracion = 132;
        año = LocalDateTime.now();
        descripcion = "pelicula de suspenso basada en hechos reales";
        director = "Paco Hernandez";
    }

    public Pelicula build() {
        return new Pelicula(id, nombrePelicula, genero, duracion, año, descripcion, director);
    }
}
