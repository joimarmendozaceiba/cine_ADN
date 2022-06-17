package com.ceiba.pelicula.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import com.ceiba.pelicula.modelo.entidad.Pelicula;
import com.ceiba.pelicula.puerto.repositorio.RepositorioPelicula;
import com.ceiba.pelicula.servicio.testdatabuilder.PeliculaTestDataBuilder;
import com.ceiba.pelicula.utils.MensajesDeExcepcion;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicioCrearPeliculaTest {


    @Test
    void validarPeliculaExistenciaPreviaTest() {
        // arrange
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        RepositorioPelicula repositorioPelicula = Mockito.mock(RepositorioPelicula.class);
        Mockito.when(repositorioPelicula.existe(Mockito.anyLong())).thenReturn(true);
        CrearPeliculaServicio crearPeliculaServicio = new CrearPeliculaServicio(repositorioPelicula);
        // act - assert
        BasePrueba.assertThrows(() -> crearPeliculaServicio.ejecutar(pelicula), ExcepcionValorInvalido.class, MensajesDeExcepcion.YA_EXISTE_UNA_PELICULA_REGISTRADA_CON_ESTE_ID.getMensaje());
    }

    @Test
    void validarCreacionPelicula() {
        // arrange
        Long ID = 1L;
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        RepositorioPelicula repositorioPelicula = Mockito.mock(RepositorioPelicula.class);
        Mockito.when(repositorioPelicula.existe(Mockito.anyLong())).thenReturn(false);
        Mockito.when(repositorioPelicula.crear(pelicula)).thenReturn(ID);
        CrearPeliculaServicio crearPeliculaServicio = new CrearPeliculaServicio(repositorioPelicula);
        // act - assert
        assertEquals(ID, crearPeliculaServicio.ejecutar(pelicula));
    }
}
