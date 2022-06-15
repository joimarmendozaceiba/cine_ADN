package com.ceiba.pelicula.testdatabuilder;

import com.ceiba.cliente.comando.ComandoCliente;
import com.ceiba.pelicula.comando.ComandoPelicula;

import java.time.LocalDateTime;

public class ComandoPeliculaTestDataBuilder {
    private Long id;
    private String nombrePelicula;
    private String genero;
    private int duracion;
    private LocalDateTime año;
    private String descripcion;
    private String director;

    public ComandoPeliculaTestDataBuilder() {
        nombrePelicula = "pelicula de una movie";
        genero = "accion";
        duracion = 150;
        año = LocalDateTime.now();
        descripcion = "prueba de descripcion para pelicula";
        director = "Pepito Perez";

    }

    public ComandoPelicula build() {
        return new ComandoPelicula(id,nombrePelicula, genero, duracion, año, descripcion, director);
    }
}
