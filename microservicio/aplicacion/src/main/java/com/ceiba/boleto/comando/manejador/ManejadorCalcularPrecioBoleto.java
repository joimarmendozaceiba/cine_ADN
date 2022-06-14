package com.ceiba.boleto.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.boleto.comando.ComandoBoleto;
import com.ceiba.boleto.comando.fabrica.FabricaBoleto;
import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.servicio.CalcularPrecioBoletoServicio;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component

public class ManejadorCalcularPrecioBoleto implements ManejadorComandoRespuesta<ComandoBoleto, ComandoRespuesta<Double>> {

    private final FabricaBoleto fabricaBoleto;
    private final CalcularPrecioBoletoServicio calcularPrecioBoletoServicio;

    public ManejadorCalcularPrecioBoleto(FabricaBoleto fabricaBoleto, CalcularPrecioBoletoServicio calcularPrecioBoletoServicio) {
        this.fabricaBoleto = fabricaBoleto;
        this.calcularPrecioBoletoServicio = calcularPrecioBoletoServicio;
    }

    @Override
    public ComandoRespuesta<Double> ejecutar(ComandoBoleto comando) {
        Boleto boleto = this.fabricaBoleto.crear(comando);
        return new ComandoRespuesta<>(calcularPrecioBoletoServicio.ejecutar(boleto));
    }

}
