package com.ceiba.boleto.controlador;


public class RespuestaFacturar {
    private Long valor;

    public RespuestaFacturar() {
    }

    public RespuestaFacturar(Long valor) {
        this.valor = valor;
    }

    public Long getValor() {
        return valor;
    }
}
