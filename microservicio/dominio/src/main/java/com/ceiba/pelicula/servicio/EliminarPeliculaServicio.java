package com.ceiba.pelicula.servicio;

import com.ceiba.pelicula.puerto.repositorio.RepositorioPelicula;

public class EliminarPeliculaServicio {
    private final RepositorioPelicula repositorioPelicula;

    public EliminarPeliculaServicio(RepositorioPelicula repositorioPelicula) {
        this.repositorioPelicula = repositorioPelicula;
    }

    public void ejecutar(Long id) {
        this.repositorioPelicula.eliminar(id);
    }
}
