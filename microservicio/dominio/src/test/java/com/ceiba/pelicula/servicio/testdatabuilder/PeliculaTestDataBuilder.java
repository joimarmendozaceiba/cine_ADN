package com.ceiba.pelicula.servicio.testdatabuilder;

import com.ceiba.pelicula.modelo.entidad.Pelicula;

import java.time.LocalDateTime;

public class PeliculaTestDataBuilder {

    private Long id;
    private String nombrePelicula;
    private String genero;
    private int duracion;
    private int anio;
    private String descripcion;
    private String director;

    public PeliculaTestDataBuilder() {
        id = 1L;
        nombrePelicula = "Avalancha en el aire";
        genero = "suspenso";
        duracion = 132;
        anio = 2022;
        descripcion = "pelicula de suspenso basada en hechos reales";
        director = "Paco Hernandez";
    }

    public Pelicula build() {
        return new Pelicula(id, nombrePelicula, genero, duracion, anio, descripcion, director);
    }
}
