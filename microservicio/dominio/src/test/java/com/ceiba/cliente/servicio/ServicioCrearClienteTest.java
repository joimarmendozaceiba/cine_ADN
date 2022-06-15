package com.ceiba.cliente.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.servicio.testdatabuilder.ClienteTestDataBuilder;
import com.ceiba.cliente.utils.MensajesDeExcepcion;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioCrearClienteTest {


    @Test
    public void validarClienteExistenciaPreviaTest() {
        // arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(true);
        CrearClienteServicio crearClienteServicio = new CrearClienteServicio(repositorioCliente);
        // act - assert
        BasePrueba.assertThrows(() -> crearClienteServicio.ejecutar(cliente), ExcepcionValorInvalido.class, MensajesDeExcepcion.YA_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID.getMensaje());
    }

    @Test
    public void validarCreacionCliente() {
        // arrange
        Long ID = 1L;
        Cliente cliente = new ClienteTestDataBuilder().build();
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(false);
        Mockito.when(repositorioCliente.crear(cliente)).thenReturn(ID);
        CrearClienteServicio crearClienteServicio = new CrearClienteServicio(repositorioCliente);
        // act - assert
        assertEquals(ID, crearClienteServicio.ejecutar(cliente));
    }
}
