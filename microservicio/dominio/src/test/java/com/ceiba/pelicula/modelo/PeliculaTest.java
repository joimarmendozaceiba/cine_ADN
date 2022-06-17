package com.ceiba.pelicula.modelo;

import com.ceiba.pelicula.modelo.dto.PeliculaDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PeliculaTest {

    @Test
    void validarCreacionExitos() {
        Long id = 1L;
        String nombrePelicula = "Nombre de la pelicula";
        String genero = "Genero de la pelicula";
        int duracion = 120;
        int anio = 2022;
        String descripcion = "Descripcion de la pelicula";
        String director = "director de la pelicula";

        PeliculaDTO pelicula = new PeliculaDTO(id, nombrePelicula, genero, duracion, anio, descripcion, director);


        Assertions.assertEquals(1, pelicula.getId());
        Assertions.assertEquals("Nombre de la pelicula", pelicula.getNombrePelicula());
        Assertions.assertEquals("Genero de la pelicula", pelicula.getGenero());
        Assertions.assertEquals(120, pelicula.getDuracion());
        Assertions.assertEquals(2022, pelicula.getAnio());
        Assertions.assertEquals("Descripcion de la pelicula", pelicula.getDescripcion());
        Assertions.assertEquals("director de la pelicula", pelicula.getDirector());
    }

}
