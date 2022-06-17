package com.ceiba.cartelera.servicio.modelo;

import com.ceiba.cartelera.modelo.dto.CarteleraDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class CarteleraTest {

    @Test
    void validarCreacionExitos() {
        Long id = 1L;
        String nombreMes = "Junio";
        int idPelicula = 3;
        LocalDateTime fechaInicio = LocalDateTime.now();
        LocalDateTime fechaFin = LocalDateTime.now();


        CarteleraDTO cartelera = new CarteleraDTO(id, nombreMes, idPelicula, fechaInicio, fechaFin);

        Assertions.assertEquals(1, cartelera.getId());
        Assertions.assertEquals("Junio", cartelera.getNombreMes());
        Assertions.assertEquals(3, cartelera.getIdPelicula());
    }

}
