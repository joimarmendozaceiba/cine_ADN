package com.ceiba.cartelera.testdatabuilder;

import com.ceiba.cartelera.comando.ComandoCartelera;

import java.time.LocalDateTime;

public class ComandoCarteleraTestDataBuilder {
    private Long id;
    private String nombreMes;
    private int idPelicula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public ComandoCarteleraTestDataBuilder() {
        nombreMes = "Junio";
        idPelicula = 2;
        fechaInicio = LocalDateTime.now();
        fechaFin = LocalDateTime.now();
    }

    public ComandoCartelera build() {
        return new ComandoCartelera(id, nombreMes, idPelicula, fechaInicio, fechaFin);
    }
}
