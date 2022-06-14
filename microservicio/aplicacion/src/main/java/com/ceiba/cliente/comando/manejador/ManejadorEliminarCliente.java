package com.ceiba.cliente.comando.manejador;

import com.ceiba.cliente.servicio.EliminarClienteServicio;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarCliente implements ManejadorComando<Long> {

    private final EliminarClienteServicio eliminarClienteServicio;

    public ManejadorEliminarCliente(EliminarClienteServicio eliminarClienteServicio) {
        this.eliminarClienteServicio = eliminarClienteServicio;
    }


    @Override
    public void ejecutar(Long id) {
        this.eliminarClienteServicio.ejecutar(id);
    }
}
