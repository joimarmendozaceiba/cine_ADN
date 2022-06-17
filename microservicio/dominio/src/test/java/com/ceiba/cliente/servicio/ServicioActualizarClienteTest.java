package com.ceiba.cliente.servicio;


import com.ceiba.BasePrueba;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.servicio.testdatabuilder.ClienteTestDataBuilder;
import com.ceiba.cliente.utils.MensajesDeExcepcionCliente;
import com.ceiba.dominio.excepcion.ExcepcionSinDatos;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

 class ServicioActualizarClienteTest {

    @Test
     void validarClienteExistenciaPreviaTest() {
        // arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(false);
        ActualizarClienteServicio ActualizarClienteServicio = new ActualizarClienteServicio(repositorioCliente);
        // act - assert
        BasePrueba.assertThrows(() -> ActualizarClienteServicio.ejecutar(cliente), ExcepcionSinDatos.class, MensajesDeExcepcionCliente.NO_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID.getMensaje());
    }

    @Test
     void validarActualizacionAfiliadoTest() {
        // arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(true);
        ActualizarClienteServicio ActualizarClienteServicio = new ActualizarClienteServicio(repositorioCliente);
        // act - assert
        ActualizarClienteServicio.ejecutar(cliente);
        verify(repositorioCliente, times(1)).actualizar(cliente);
    }
}
