package com.ceiba.cartelera.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.boleto.comando.ComandoBoleto;
import com.ceiba.boleto.comando.fabrica.FabricaBoleto;
import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.servicio.CrearBoletoServicio;
import com.ceiba.cartelera.comando.ComandoCartelera;
import com.ceiba.cartelera.comando.fabrica.FabricaCartelera;
import com.ceiba.cartelera.modelo.entidad.Cartelera;
import com.ceiba.cartelera.servicio.CrearCarteleraServicio;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCartelera implements ManejadorComandoRespuesta<ComandoCartelera, ComandoRespuesta<Long>> {
    private final FabricaCartelera fabricaCartelera;

    private final CrearCarteleraServicio crearCarteleraServicio;

    public ManejadorCrearCartelera(FabricaCartelera fabricaCartelera, CrearCarteleraServicio crearCarteleraServicio) {
        this.fabricaCartelera = fabricaCartelera;
        this.crearCarteleraServicio = crearCarteleraServicio;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoCartelera comando) {
        Cartelera cartelera = this.fabricaCartelera.crear(comando);
        return new ComandoRespuesta<>(this.crearCarteleraServicio.ejecutar(cartelera));
    }
}
