package com.ceiba.boleto.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.puerto.repositorio.RepositorioBoleto;
import com.ceiba.boleto.servicio.testdatabuilder.BoletoTestDataBuilder;
import com.ceiba.boleto.utils.MensajesDeExcepcionBoleto;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.servicio.CrearClienteServicio;
import com.ceiba.cliente.servicio.testdatabuilder.ClienteTestDataBuilder;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class ServicioCrearBoletoTest {


    @Test
     void validarBoletoExistenciaPreviaTest() {
        // arrange
        Boleto boleto = new BoletoTestDataBuilder().build();
        RepositorioBoleto repositorioBoleto = Mockito.mock(RepositorioBoleto.class);
        CalcularPrecioBoletoServicio calcularPrecioBoletoServicio = new CalcularPrecioBoletoServicio();
        Mockito.when(repositorioBoleto.existe(Mockito.anyLong())).thenReturn(true);
        CrearBoletoServicio crearBoletoServicio = new CrearBoletoServicio(repositorioBoleto,calcularPrecioBoletoServicio);
        // act - assert
        BasePrueba.assertThrows(() -> crearBoletoServicio.ejecutar(boleto), ExcepcionDuplicidad.class, MensajesDeExcepcionBoleto.YA_EXISTE_UNA_ENTRADA_REGISTRADA_CON_ESTE_ID.getMensaje());
    }

    @Test
     void validarCreacionAfiliado() {
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
