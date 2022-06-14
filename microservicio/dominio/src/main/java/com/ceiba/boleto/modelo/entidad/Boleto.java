package com.ceiba.boleto.modelo.entidad;

import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Getter
public class Boleto {
    private Long id;
    private Double valor;
    private String nombrePelicula;
    private LocalDateTime fechaFuncion;
    private String pagoBanco;
    private int sedeID;

    public Boleto(Long id, Double valor, String nombrePelicula, LocalDateTime fechaFuncion, String pagoBanco, int sedeID) {
        this.id = id;
        this.valor = valor;
        this.nombrePelicula = nombrePelicula;
        this.fechaFuncion = fechaFuncion;
        this.pagoBanco = pagoBanco;
        this.sedeID = sedeID;
    }

    public boolean promoLunesMartes() {
        return this.fechaFuncion.getDayOfWeek() == DayOfWeek.MONDAY || this.fechaFuncion.getDayOfWeek() == DayOfWeek.TUESDAY;
    }

    public boolean promoViernes() {
        return this.fechaFuncion.getDayOfWeek() == DayOfWeek.FRIDAY;
    }

    public boolean promoMiercolesJueves() {
        return this.fechaFuncion.getDayOfWeek() == DayOfWeek.WEDNESDAY || this.fechaFuncion.getDayOfWeek() == DayOfWeek.THURSDAY;
    }

    public boolean promoFinDeSemana() {
        return this.fechaFuncion.getDayOfWeek() == DayOfWeek.SATURDAY || this.fechaFuncion.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    public void setPrecio(Double valorTotal) {
        this.valor = valorTotal;
    }

}
