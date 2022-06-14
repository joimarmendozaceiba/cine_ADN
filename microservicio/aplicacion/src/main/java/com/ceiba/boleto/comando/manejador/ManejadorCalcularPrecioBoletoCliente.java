package com.ceiba.boleto.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.boleto.comando.ComandoBoleto;
import com.ceiba.boleto.comando.fabrica.FabricaBoleto;
import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.servicio.CalcularPrecioBoletoClienteServicio;
import com.ceiba.cliente.comando.ComandoCliente;
import com.ceiba.cliente.comando.fabrica.FabricaCliente;
import com.ceiba.cliente.modelo.entidad.Cliente;
import org.springframework.stereotype.Component;

@Component

public class ManejadorCalcularPrecioBoletoCliente {

    private final FabricaBoleto fabricaBoleto;
    private final FabricaCliente fabricaCliente;
    private final CalcularPrecioBoletoClienteServicio calcularPrecioBoletoClienteServicio;

    public ManejadorCalcularPrecioBoletoCliente(FabricaBoleto fabricaBoleto, FabricaCliente fabricaCliente, CalcularPrecioBoletoClienteServicio calcularPrecioBoletoClienteServicio) {
        this.fabricaBoleto = fabricaBoleto;
        this.fabricaCliente = fabricaCliente;
        this.calcularPrecioBoletoClienteServicio = calcularPrecioBoletoClienteServicio;
    }


    public ComandoRespuesta<Double> ejecutar(ComandoBoleto comando, ComandoCliente cliente) {
        Boleto entrada = this.fabricaBoleto.crear(comando);
        Cliente afiliado1 = this.fabricaCliente.crear(cliente);
        return new ComandoRespuesta<>(calcularPrecioBoletoClienteServicio.ejecutar(entrada,afiliado1));
    }
}
