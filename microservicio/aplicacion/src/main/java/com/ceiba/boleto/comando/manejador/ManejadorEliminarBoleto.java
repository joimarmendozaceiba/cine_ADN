package com.ceiba.boleto.comando.manejador;

import com.ceiba.boleto.servicio.EliminarBoletoServicio;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarBoleto implements ManejadorComando<Long> {
    private final EliminarBoletoServicio eliminarBoletoServicio;

    public ManejadorEliminarBoleto(EliminarBoletoServicio eliminarBoletoServicio) {
        this.eliminarBoletoServicio = eliminarBoletoServicio;
    }

    @Override
    public void ejecutar(Long id ) {
        this.eliminarBoletoServicio.ejecutar(id);
    }
}
