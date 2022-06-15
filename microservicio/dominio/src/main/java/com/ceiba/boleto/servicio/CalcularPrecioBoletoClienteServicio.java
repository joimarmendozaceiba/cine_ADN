package com.ceiba.boleto.servicio;

import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.puerto.repositorio.RepositorioBoleto;
import com.ceiba.cliente.modelo.entidad.Cliente;

public class CalcularPrecioBoletoClienteServicio {

    private static final double DESCUENTO_LUNES_Y_MARTES_AFILIADO = 0.5;
    private static final double DESCUENTO_MIERCOLES_JUEVES_AFILIADO = 0.5;
    private static final double DESCUENTO_VIERNES_AFILIADO = 0.7;

    private final RepositorioBoleto repositorioBoleto;


    public CalcularPrecioBoletoClienteServicio(RepositorioBoleto repositorioEntrada) {
        this.repositorioBoleto = repositorioEntrada;
    }

    public Double ejecutar(Boleto boleto) {
        Double precioEntrada = boleto.getValor();
        if (boleto.promoLunesMartes()) {
            return precioEntrada * DESCUENTO_LUNES_Y_MARTES_AFILIADO;
        } else if (boleto.promoMiercolesJueves()) {
            return precioEntrada * DESCUENTO_MIERCOLES_JUEVES_AFILIADO;
        } else if (boleto.promoViernes()) {
            return precioEntrada * DESCUENTO_VIERNES_AFILIADO;
        }
        return precioEntrada;
    }
}
