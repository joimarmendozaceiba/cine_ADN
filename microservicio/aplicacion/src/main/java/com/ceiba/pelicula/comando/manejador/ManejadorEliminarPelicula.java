package com.ceiba.pelicula.comando.manejador;

import com.ceiba.cliente.servicio.EliminarClienteServicio;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarPelicula implements ManejadorComando<Long> {

    private final EliminarClienteServicio eliminarClienteServicio;

    public ManejadorEliminarPelicula(EliminarClienteServicio eliminarClienteServicio) {
        this.eliminarClienteServicio = eliminarClienteServicio;
    }


    @Override
    public void ejecutar(Long id) {
        this.eliminarClienteServicio.ejecutar(id);
    }
}
