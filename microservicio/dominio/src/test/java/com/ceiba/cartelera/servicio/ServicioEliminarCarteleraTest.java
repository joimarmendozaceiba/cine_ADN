package com.ceiba.cartelera.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.cartelera.modelo.entidad.Cartelera;
import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cartelera.servicio.testdatabuilder.CarteleraTestDataBuilder;
import com.ceiba.cartelera.utils.MensajesDeExcepcionCartelera;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ServicioEliminarCarteleraTest {


    @Test
    void validarCarteleraExistenciaPreviaTest() {
        // arrange
        Cartelera cartelera = new CarteleraTestDataBuilder().build();
        RepositorioCartelera repositorioCartelera = Mockito.mock(RepositorioCartelera.class);
        Mockito.when(repositorioCartelera.existe(Mockito.anyLong())).thenReturn(true);
        CrearCarteleraServicio crearCarteleraServicio = new CrearCarteleraServicio(repositorioCartelera);
        // act - assert
        BasePrueba.assertThrows(() -> crearCarteleraServicio.ejecutar(cartelera), ExcepcionValorInvalido.class, MensajesDeExcepcionCartelera.YA_EXISTE_UNA_CARTELERA_REGISTRADA_CON_ESTE_ID.getMensaje());
    }

    @Test
    void validarEliminarCartelera() {
        // arrange
        Long ID = 1L;
        Cartelera cartelera = new CarteleraTestDataBuilder().build();
        RepositorioCartelera repositorioCartelera = Mockito.mock(RepositorioCartelera.class);
        Mockito.when(repositorioCartelera.existe(Mockito.anyLong())).thenReturn(true);
        EliminarCarteleraServicio eliminarCarteleraServicio = new EliminarCarteleraServicio(repositorioCartelera);
        eliminarCarteleraServicio.ejecutar(cartelera.getId());
        // act - assert
        verify(repositorioCartelera, times(1)).eliminar(cartelera.getId());
    }

}
