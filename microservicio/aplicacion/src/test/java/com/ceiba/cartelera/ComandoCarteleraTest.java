package com.ceiba.cartelera;

import com.ceiba.cartelera.comando.ComandoCartelera;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

 class ComandoCarteleraTest {

    @Test
    void validarCreacionExitosa() {
        Long id = 1L;
        String nombreMes = "Junio";
        int id_pelicula = 1;
        LocalDateTime fechaInicio = LocalDateTime.now();
        LocalDateTime fechaFin = LocalDateTime.now();

        ComandoCartelera comandoCartelera = new ComandoCartelera(id, nombreMes, id_pelicula, fechaInicio, fechaFin);

        Assertions.assertEquals(1, comandoCartelera.getId());
        Assertions.assertEquals("Junio", comandoCartelera.getNombreMes());
        Assertions.assertEquals(1, comandoCartelera.getId_pelicula());
    }
}
