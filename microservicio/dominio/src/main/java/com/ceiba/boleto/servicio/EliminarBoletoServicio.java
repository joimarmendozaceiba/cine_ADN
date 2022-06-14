package com.ceiba.boleto.servicio;

import com.ceiba.boleto.puerto.repositorio.RepositorioBoleto;

public class EliminarBoletoServicio {

    private final RepositorioBoleto repositorioBoleto;

    public EliminarBoletoServicio(RepositorioBoleto repositorioBoleto) {
        this.repositorioBoleto = repositorioBoleto;
    }

    public void ejecutar(Long id) {
        this.repositorioBoleto.eliminar(id);
    }
}
