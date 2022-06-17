package com.ceiba.cartelera.servicio;


import com.ceiba.BasePrueba;
import com.ceiba.cartelera.modelo.entidad.Cartelera;
import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cartelera.servicio.testdatabuilder.CarteleraTestDataBuilder;
import com.ceiba.cartelera.utils.MensajesDeExcepcionCartelera;
import com.ceiba.dominio.excepcion.ExcepcionSinDatos;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ServicioActualizarCarteleraTest {

    @Test
    void validarCarteleraExistenciaPreviaTest() {
        // arrange
        Cartelera cartelera = new CarteleraTestDataBuilder().build();
        RepositorioCartelera repositorioCartelera = Mockito.mock(RepositorioCartelera.class);
        Mockito.when(repositorioCartelera.existe(Mockito.anyLong())).thenReturn(false);
        ActualizarCarteleraServicio actualizarCarteleraServicio = new ActualizarCarteleraServicio(repositorioCartelera);
        // act - assert
        BasePrueba.assertThrows(() -> actualizarCarteleraServicio.ejecutar(cartelera), ExcepcionSinDatos.class, MensajesDeExcepcionCartelera.NO_EXISTE_UNA_CARTELERA_REGISTRADA_CON_ESTE_ID.getMensaje());
    }

    @Test
    void validarActualizacionCarteleraTest() {
        // arrange
        Cartelera cartelera = new CarteleraTestDataBuilder().build();
        RepositorioCartelera repositorioCartelera = Mockito.mock(RepositorioCartelera.class);
        Mockito.when(repositorioCartelera.existe(Mockito.anyLong())).thenReturn(true);
        ActualizarCarteleraServicio actualizarCarteleraServicio = new ActualizarCarteleraServicio(repositorioCartelera);
        // act - assert
        actualizarCarteleraServicio.ejecutar(cartelera);
        verify(repositorioCartelera, times(1)).actualizar(cartelera);
    }
}
