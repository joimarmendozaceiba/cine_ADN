package com.ceiba.cartelera.modelo.entidad;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Cartelera {
    private Long id;
    private String nombreMes;
    private int idPelicula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public Cartelera(Long id, String nombreMes, int idPelicula, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.id = id;
        this.nombreMes = nombreMes;
        this.idPelicula = idPelicula;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

}
