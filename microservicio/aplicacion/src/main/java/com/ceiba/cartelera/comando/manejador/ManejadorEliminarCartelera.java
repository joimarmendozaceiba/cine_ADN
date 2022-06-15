package com.ceiba.cartelera.comando.manejador;

import com.ceiba.cartelera.servicio.EliminarCarteleraServicio;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarCartelera implements ManejadorComando<Long> {
    private final EliminarCarteleraServicio eliminarCarteleraServicio;

    public ManejadorEliminarCartelera(EliminarCarteleraServicio eliminarCarteleraServicio) {
        this.eliminarCarteleraServicio = eliminarCarteleraServicio;
    }

    @Override
    public void ejecutar(Long id) {
        this.eliminarCarteleraServicio.ejecutar(id);
    }
}
