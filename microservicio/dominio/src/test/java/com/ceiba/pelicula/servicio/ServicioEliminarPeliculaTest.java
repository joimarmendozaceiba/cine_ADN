package com.ceiba.pelicula.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import com.ceiba.pelicula.modelo.entidad.Pelicula;
import com.ceiba.pelicula.puerto.repositorio.RepositorioPelicula;
import com.ceiba.pelicula.servicio.testdatabuilder.PeliculaTestDataBuilder;
import com.ceiba.pelicula.utils.MensajesDeExcepcion;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ServicioEliminarPeliculaTest {

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
    void validarEliminarPelicula() {
        // arrange
        Long ID = 1L;
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        RepositorioPelicula repositorioPelicula = Mockito.mock(RepositorioPelicula.class);
        Mockito.when(repositorioPelicula.existe(Mockito.anyLong())).thenReturn(true);
        EliminarPeliculaServicio eliminarPeliculaServicio = new EliminarPeliculaServicio(repositorioPelicula);

        // act - assert
        eliminarPeliculaServicio.ejecutar(pelicula.getId());
        verify(repositorioPelicula, times(1)).eliminar(pelicula.getId());
    }
}
