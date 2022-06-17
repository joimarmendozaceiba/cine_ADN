package com.ceiba.cartelera.servicio.testdatabuilder;

import com.ceiba.cartelera.modelo.entidad.Cartelera;

import java.time.LocalDateTime;

public class CarteleraTestDataBuilder {

    private Long id;
    private String nombreMes;
    private int idPelicula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public CarteleraTestDataBuilder() {
        id = 1L;
        nombreMes = "Junio";
        idPelicula = 3;
        fechaInicio = LocalDateTime.now();
        fechaFin = LocalDateTime.now();
    }

    public Cartelera build() {
        return new Cartelera(id, nombreMes, idPelicula, fechaInicio, fechaFin);
    }
}
