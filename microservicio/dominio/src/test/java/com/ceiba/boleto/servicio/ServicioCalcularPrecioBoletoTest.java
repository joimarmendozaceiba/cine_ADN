package com.ceiba.boleto.servicio;

import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.puerto.repositorio.RepositorioBoleto;
import com.ceiba.boleto.servicio.testdatabuilder.BoletoTestDataBuilder;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.servicio.testdatabuilder.ClienteTestDataBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioCalcularPrecioBoletoTest {

    double epsilon = 0.000001d;
    @Test
    public void validarPrecioLunesMartesCliente() {
        // arrange
        Boleto boleto = new BoletoTestDataBuilder().fechaFuncionLunesMartes().build();

        RepositorioBoleto repositorioBoleto = Mockito.mock(RepositorioBoleto.class);
        Mockito.when(repositorioBoleto.existe(Mockito.anyLong())).thenReturn(true);

        CalcularPrecioBoletoServicio calcularPrecioBoletoServicio = new CalcularPrecioBoletoServicio();

        // act - assert
        assertEquals(5600, calcularPrecioBoletoServicio.ejecutar(boleto));
    }

    @Test
    public void validarPrecioMiercolesJuevesCliente() {
        // arrange
        Boleto boleto = new BoletoTestDataBuilder().fechaFuncionMiercolesJueves().build();
        Cliente cliente = new ClienteTestDataBuilder().build();

        RepositorioBoleto repositorioBoleto = Mockito.mock(RepositorioBoleto.class);
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);

        Mockito.when(repositorioBoleto.existe(Mockito.anyLong())).thenReturn(true);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(true);


        CalcularPrecioBoletoServicio calcularPrecioBoletoServicio = new CalcularPrecioBoletoServicio();

        // act - assert
        assertEquals(4200, calcularPrecioBoletoServicio.ejecutar(boleto));
    }

    @Test
    public void validarPrecioViernesCliente() {
        // arrange
        Boleto boleto = new BoletoTestDataBuilder().fechaFuncionViernes().build();
        Cliente cliente = new ClienteTestDataBuilder().build();

        RepositorioBoleto repositorioBoleto = Mockito.mock(RepositorioBoleto.class);
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);

        Mockito.when(repositorioBoleto.existe(Mockito.anyLong())).thenReturn(true);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(true);


        CalcularPrecioBoletoServicio calcularPrecioBoletoServicio = new CalcularPrecioBoletoServicio();

        // act - assert
        assertEquals(7700d, (calcularPrecioBoletoServicio.ejecutar(boleto)), epsilon);

    }

    @Test
    public void validarPrecioFinDeSemanaCliente() {
        // arrange
        Boleto boleto = new BoletoTestDataBuilder().fechaFuncionFinDeSemana().build();
        Cliente cliente = new ClienteTestDataBuilder().build();


        RepositorioBoleto repositorioBoleto = Mockito.mock(RepositorioBoleto.class);
        RepositorioCliente repositorioCliente = Mockito.mock(RepositorioCliente.class);

        Mockito.when(repositorioBoleto.existe(Mockito.anyLong())).thenReturn(true);
        Mockito.when(repositorioCliente.existe(Mockito.anyLong())).thenReturn(true);


        CalcularPrecioBoletoServicio calcularPrecioBoletoServicio = new CalcularPrecioBoletoServicio();

        // act - assert
        assertEquals(9100, calcularPrecioBoletoServicio.ejecutar(boleto));
    }

}
