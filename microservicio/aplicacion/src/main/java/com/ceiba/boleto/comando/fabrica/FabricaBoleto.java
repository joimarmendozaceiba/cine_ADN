package com.ceiba.boleto.comando.fabrica;

import com.ceiba.boleto.comando.ComandoBoleto;
import com.ceiba.boleto.modelo.entidad.Boleto;
import org.springframework.stereotype.Component;

@Component
public class FabricaBoleto {
    public Boleto crear(ComandoBoleto comandoBoleto) {
        return new Boleto(
                comandoBoleto.getId(),
                comandoBoleto.getValor(),
                comandoBoleto.getNombrePelicula(),
                comandoBoleto.getFechaFuncion(),
                comandoBoleto.getPagoBanco(),
                comandoBoleto.getSedeID()
        );
    }
}
