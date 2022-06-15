package com.ceiba.boleto.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.boleto.comando.ComandoBoleto;
import com.ceiba.boleto.comando.fabrica.FabricaBoleto;
import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.cliente.comando.ComandoCliente;
import com.ceiba.cliente.comando.fabrica.FabricaCliente;
import com.ceiba.cliente.modelo.entidad.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearBoletoCliente {
    private final FabricaBoleto fabricaBoleto;
    private final FabricaCliente fabricaCliente;
    private final CrearBoletoClienteServicio crearBoletoClienteServicio;

    public ManejadorCrearBoletoCliente(FabricaBoleto fabricaBoleto, FabricaCliente fabricaCliente, CrearBoletoClienteServicio crearBoletoClienteServicio) {
        this.fabricaBoleto = fabricaBoleto;
        this.fabricaCliente = fabricaCliente;
        this.crearBoletoClienteServicio = crearBoletoClienteServicio;
    }


    public ComandoRespuesta<Long> ejecutar(ComandoBoleto comando, ComandoCliente afiliado) {
        Boleto entrada = this.fabricaBoleto.crear(comando);
        Cliente afiliado1 = this.fabricaCliente.crear(afiliado);
        return new ComandoRespuesta<>(this.crearBoletoClienteServicio.ejecutar(entrada,afiliado1));
    }
}
