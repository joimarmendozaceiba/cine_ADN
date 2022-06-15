package com.ceiba.boleto.testdatabuilder;

import com.ceiba.boleto.comando.ComandoBoleto;

import java.time.LocalDateTime;
import java.time.Month;

public class ComandoBoletoTestDataBuilder {
    private Long id;
    private Double valor;
    private String nombrePelicula;
    private LocalDateTime fechaFuncion;
    private String pagoBanco;
    private int sedeID;

    public ComandoBoletoTestDataBuilder() {
        valor = 7000.00;
        nombrePelicula = "pelicula de una movie";
        pagoBanco = "Banco amigo";
        sedeID = 1;
        fechaFuncion = LocalDateTime.now();
    }

    public ComandoBoletoTestDataBuilder fechaFuncionFinDeSemana() {
        this.fechaFuncion = LocalDateTime.of(2021, Month.JULY, 10, 18, 00);
        return this;
    }

    public ComandoBoletoTestDataBuilder fechaFuncionLunesMartes() {
        this.fechaFuncion = LocalDateTime.of(2021, Month.JULY, 13, 18, 00);
        return this;
    }

    public ComandoBoletoTestDataBuilder fechaFuncionMiercolesJueves() {
        this.fechaFuncion = LocalDateTime.of(2021, Month.JULY, 15, 18, 00);
        return this;
    }

    public ComandoBoletoTestDataBuilder fechaFuncionViernes() {
        this.fechaFuncion = LocalDateTime.of(2021, Month.JULY, 9, 18, 00);
        return this;
    }

    public ComandoBoleto build() {
        return new ComandoBoleto(id, valor, nombrePelicula, fechaFuncion, pagoBanco, sedeID);
    }
}
