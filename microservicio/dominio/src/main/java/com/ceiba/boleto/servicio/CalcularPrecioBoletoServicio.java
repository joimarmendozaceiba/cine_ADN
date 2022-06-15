package com.ceiba.boleto.servicio;

import com.ceiba.boleto.modelo.entidad.Boleto;

public class CalcularPrecioBoletoServicio {

    private static final double DESCUENTO_LUNES_Y_MARTES = 0.8;
    private static final double AUMENTO_FIN_DE_SEMANA = 1.3;
    private static final double DESCUENTO_MIERCOLES_JUEVES = 0.6;
    private static final double DESCUENTO_VIERNES= 1.1;

    //constructor
    public CalcularPrecioBoletoServicio() {
    }

    public double ejecutar(Boleto boleto) {
        Double precioBoleto = boleto.getValor();
        if (boleto.promoLunesMartes()) {
            return precioBoleto * DESCUENTO_LUNES_Y_MARTES;
        } else if (boleto.promoMiercolesJueves()) {
            return precioBoleto * DESCUENTO_MIERCOLES_JUEVES;
        } else if (boleto.promoViernes() ) {
            return precioBoleto * DESCUENTO_VIERNES;
        } else if (boleto.promoFinDeSemana()) {
            return precioBoleto * AUMENTO_FIN_DE_SEMANA;
        }
        return precioBoleto;
    }
}
