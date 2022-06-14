package com.ceiba.cliente.comando.manejador;

import com.ceiba.cliente.comando.ComandoCliente;
import com.ceiba.cliente.comando.fabrica.FabricaCliente;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.servicio.ActualizarClienteServicio;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarCliente implements ManejadorComando<ComandoCliente> {

    private final FabricaCliente fabricaCliente;
    private final ActualizarClienteServicio actualizarClienteServicio;

    public ManejadorActualizarCliente(FabricaCliente fabricaCliente, ActualizarClienteServicio actualizarClienteServicio) {
        this.fabricaCliente = fabricaCliente;
        this.actualizarClienteServicio = actualizarClienteServicio;
    }

    public void ejecutar(ComandoCliente comandoAfiliado) {
        Cliente cliente = this.fabricaCliente.crear(comandoAfiliado);
        this.actualizarClienteServicio.ejecutar(cliente);
    }


}
