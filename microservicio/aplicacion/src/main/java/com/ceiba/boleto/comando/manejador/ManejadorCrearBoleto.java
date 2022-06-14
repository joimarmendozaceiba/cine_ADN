package com.ceiba.boleto.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.boleto.comando.ComandoBoleto;
import com.ceiba.boleto.comando.fabrica.FabricaBoleto;
import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.servicio.CrearBoletoServicio;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearBoleto implements ManejadorComandoRespuesta<ComandoBoleto, ComandoRespuesta<Long>> {
    private final FabricaBoleto fabricaBoleto;

    private final CrearBoletoServicio crearBoletoServicio;

    public ManejadorCrearBoleto(FabricaBoleto fabricaBoleto, CrearBoletoServicio crearBoletoServicio) {
        this.fabricaBoleto = fabricaBoleto;
        this.crearBoletoServicio = crearBoletoServicio;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoBoleto comando) {
        Boleto boleto = this.fabricaBoleto.crear(comando);
        return new ComandoRespuesta<>(this.crearBoletoServicio.ejecutar(boleto));
    }
}
