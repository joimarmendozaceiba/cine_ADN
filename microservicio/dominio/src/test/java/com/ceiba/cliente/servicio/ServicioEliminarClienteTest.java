package com.ceiba.cliente.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.cartelera.modelo.entidad.Cartelera;
import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cartelera.servicio.EliminarCarteleraServicio;
import com.ceiba.cartelera.servicio.testdatabuilder.CarteleraTestDataBuilder;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.servicio.testdatabuilder.ClienteTestDataBuilder;
import com.ceiba.cliente.utils.MensajesDeExcepcionCliente;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ServicioEliminarClienteTest {


    @Test
    void validarClienteExistenciaPreviaTest() {
        // arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(true);
        CrearClienteServicio crearClienteServicio = new CrearClienteServicio(repositorioCliente);
        // act - assert
        BasePrueba.assertThrows(() -> crearClienteServicio.ejecutar(cliente), ExcepcionValorInvalido.class, MensajesDeExcepcionCliente.YA_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID.getMensaje());
    }

    @Test
    void validarEliminarCliente() {
        // arrange
        Long ID = 1L;
        Cliente cliente = new ClienteTestDataBuilder().build();
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(true);
        EliminarClienteServicio eliminarClienteServicio = new EliminarClienteServicio(repositorioCliente);
        eliminarClienteServicio.ejecutar(cliente.getId());
        // act - assert
        verify(repositorioCliente, times(1)).eliminar(cliente.getId());
    }

}
