package com.ceiba.boleto;

import com.ceiba.boleto.comando.ComandoBoleto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

 class ComandoBoletoTest {

    @Test
    void validarCreacionExitosa() {
        Long id = 1L;
        Double valor = 7000.00;
        String nombrePelicula = "Nombre de pelicula";
        LocalDateTime fechaFuncion = LocalDateTime.now();
        String pagoBanco = "Banco amigo";
        int sedeID = 2;

        ComandoBoleto comandoBoleto = new ComandoBoleto(id, valor, nombrePelicula, fechaFuncion, pagoBanco, sedeID);

        Assertions.assertEquals(1, comandoBoleto.getId());
        Assertions.assertEquals("Nombre de pelicula", comandoBoleto.getNombrePelicula());
        Assertions.assertEquals(7000.00, comandoBoleto.getValor());
        Assertions.assertEquals("Banco amigo", comandoBoleto.getPagoBanco());
        Assertions.assertEquals(2, comandoBoleto.getSedeID());
    }


}
