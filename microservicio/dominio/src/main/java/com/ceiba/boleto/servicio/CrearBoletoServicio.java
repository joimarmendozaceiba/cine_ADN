package com.ceiba.boleto.servicio;

import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.puerto.repositorio.RepositorioBoleto;
import com.ceiba.boleto.utils.MensajesDeExcepcionBoleto;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;

public class CrearBoletoServicio {

    private RepositorioBoleto repositorioBoleto;
    private CalcularPrecioBoletoServicio calcularPrecioBoletoServicio;

    public CrearBoletoServicio(RepositorioBoleto repositorioBoleto, CalcularPrecioBoletoServicio calcularPrecioBoletoServicio) {
        this.repositorioBoleto = repositorioBoleto;
        this.calcularPrecioBoletoServicio = calcularPrecioBoletoServicio;
    }


    public Long ejecutar(Boleto boleto) {
        validarEntradaPrevia(boleto);
        boleto.setPrecio(calcularPrecioBoletoServicio.ejecutar(boleto));
        return this.repositorioBoleto.crear(boleto);
    }

    private void validarEntradaPrevia(Boleto boleto) {
        boolean existe = this.repositorioBoleto.existe(boleto.getId());
        if (existe) {
            throw new ExcepcionDuplicidad(MensajesDeExcepcionBoleto.YA_EXISTE_UNA_ENTRADA_REGISTRADA_CON_ESTE_ID.getMensaje());
        }
    }


}
