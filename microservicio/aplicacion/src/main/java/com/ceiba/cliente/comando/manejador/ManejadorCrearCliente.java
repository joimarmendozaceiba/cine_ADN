package com.ceiba.cliente.comando.manejador;

import com.ceiba.ComandoRespuesta;

import com.ceiba.cliente.comando.ComandoCliente;
import com.ceiba.cliente.comando.fabrica.FabricaCliente;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.servicio.CrearClienteServicio;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCliente implements ManejadorComandoRespuesta<ComandoCliente, ComandoRespuesta<Long>> {
    private final FabricaCliente fabricaCliente;
    private final CrearClienteServicio crearClienteServicio;

    public ManejadorCrearCliente(FabricaCliente fabricaCliente, CrearClienteServicio crearClienteServicio) {
        this.fabricaCliente = fabricaCliente;
        this.crearClienteServicio = crearClienteServicio;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoCliente comando) {
        Cliente cliente = this.fabricaCliente.crear(comando);
        return new ComandoRespuesta<>(this.crearClienteServicio.ejecutar(cliente));
    }
}
