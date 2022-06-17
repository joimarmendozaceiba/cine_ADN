package com.ceiba.pelicula.testdatabuilder;

import com.ceiba.pelicula.comando.ComandoPelicula;

public class ComandoPeliculaTestDataBuilder {
    private Long id;
    private String nombrePelicula;
    private String genero;
    private int duracion;
    private int anio;
    private String descripcion;
    private String director;

    public ComandoPeliculaTestDataBuilder() {
        nombrePelicula = "pelicula de una movie";
        genero = "accion";
        duracion = 150;
        anio = 2022;
        descripcion = "prueba de descripcion para pelicula";
        director = "Pepito Perez";

    }

    public ComandoPelicula build() {
        return new ComandoPelicula(id, nombrePelicula, genero, duracion, anio, descripcion, director);
    }
}
