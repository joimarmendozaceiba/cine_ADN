package com.ceiba.boleto.servicio.testdatabuilder;

import com.ceiba.boleto.modelo.entidad.Boleto;

import java.time.LocalDateTime;
import java.time.Month;

public class BoletoTestDataBuilder {
    private Long id;
    private Double valor;
    private String nombrePelicula;
    private LocalDateTime fechaFuncion;
    private String pagoBanco;
    private int sedeID;

    public BoletoTestDataBuilder() {
        this.id = 1L;
        this.valor = 7000.00d;
        this.nombrePelicula = "El clavante martillo";
        this.fechaFuncion = LocalDateTime.now();
        this.pagoBanco = "Banco amigo";
        this.sedeID = 2;
    }
    public BoletoTestDataBuilder fechaFuncionFinDeSemana() {
        this.fechaFuncion = LocalDateTime.of(2021, Month.JULY, 10, 18, 00);
        return this;
    }
    public BoletoTestDataBuilder fechaFuncionLunesMartes() {
        this.fechaFuncion = LocalDateTime.of(2021, Month.JULY, 13, 18, 00);
        return this;
    }
    public BoletoTestDataBuilder fechaFuncionMiercolesJueves() {
        this.fechaFuncion = LocalDateTime.of(2021, Month.JULY, 15, 18, 00);
        return this;
    }
    public BoletoTestDataBuilder fechaFuncionViernes() {
        this.fechaFuncion = LocalDateTime.of(2021, Month.JULY, 9, 18, 00);
        return this;
    }

    public Boleto build() {
        return new Boleto(id,valor,nombrePelicula,fechaFuncion,pagoBanco,sedeID);
    }
}
