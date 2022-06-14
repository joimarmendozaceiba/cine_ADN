package com.ceiba.cartelera.comando.fabrica;

import com.ceiba.boleto.comando.ComandoBoleto;
import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.cartelera.comando.ComandoCartelera;
import com.ceiba.cartelera.modelo.entidad.Cartelera;
import org.springframework.stereotype.Component;

@Component
public class FabricaCartelera {
    public Cartelera crear(ComandoCartelera comandoCartelera) {
        return new Cartelera(
                comandoCartelera.getId(),
                comandoCartelera.getNombreMes(),
                comandoCartelera.getId_pelicula(),
                comandoCartelera.getFechaInicio(),
                comandoCartelera.getFechaFin()
        );
    }
}
