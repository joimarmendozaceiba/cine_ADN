package com.ceiba.boleto.modelo;

import com.ceiba.boleto.modelo.dto.BoletoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class BoletoTest {

    @Test
    void validarCreacionExitos() {
        Long id = 1L;
        Double valor = 7000.00;
        String nombrePelicula = "Nombre de la pelicula";
        String pagoBanco = "Banco amigo";
        int sedeID = 120;
        LocalDateTime fechaFuncion = LocalDateTime.now();


        BoletoDTO boleto = new BoletoDTO(id, valor, nombrePelicula, fechaFuncion, pagoBanco, sedeID);

        Assertions.assertEquals(1, boleto.getId());
        Assertions.assertEquals("Nombre de la pelicula", boleto.getNombrePelicula());
        Assertions.assertEquals(7000.00, boleto.getValor());
        Assertions.assertEquals("Banco amigo", boleto.getPagoBanco());
        Assertions.assertEquals(120, boleto.getSedeID());
    }

}
