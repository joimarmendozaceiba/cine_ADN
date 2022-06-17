package com.ceiba.boleto.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.puerto.repositorio.RepositorioBoleto;
import com.ceiba.boleto.servicio.testdatabuilder.BoletoTestDataBuilder;
import com.ceiba.boleto.utils.MensajesDeExcepcionBoleto;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ServicioEliminarBoletoTest {


    @Test
    void validarBoletoExistenciaPreviaTest() {
        // arrange
        Boleto boleto = new BoletoTestDataBuilder().build();
        RepositorioBoleto repositorioBoleto = Mockito.mock(RepositorioBoleto.class);
        CalcularPrecioBoletoServicio calcularPrecioBoletoServicio = new CalcularPrecioBoletoServicio();
        Mockito.when(repositorioBoleto.existe(Mockito.anyLong())).thenReturn(true);
        CrearBoletoServicio crearBoletoServicio = new CrearBoletoServicio(repositorioBoleto, calcularPrecioBoletoServicio);
        // act - assert
        BasePrueba.assertThrows(() -> crearBoletoServicio.ejecutar(boleto), ExcepcionDuplicidad.class, MensajesDeExcepcionBoleto.YA_EXISTE_UNA_ENTRADA_REGISTRADA_CON_ESTE_ID.getMensaje());
    }

    @Test
    void validarEliminarBoleto() {
        // arrange
        Long ID = 1L;
        Boleto boleto = new BoletoTestDataBuilder().build();
        RepositorioBoleto repositorioBoleto = Mockito.mock(RepositorioBoleto.class);
        Mockito.when(repositorioBoleto.existe(Mockito.anyLong())).thenReturn(true);
        EliminarBoletoServicio eliminarBoletoServicio = new EliminarBoletoServicio(repositorioBoleto);
        eliminarBoletoServicio.ejecutar(boleto.getId());
        // act - assert
        verify(repositorioBoleto, times(1)).eliminar(boleto.getId());
    }

}
