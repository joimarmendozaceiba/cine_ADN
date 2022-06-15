package com.ceiba.cartelera.servicio;

import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;

public class EliminarCarteleraServicio {
    private final RepositorioCartelera repositorioCartelera;

    public EliminarCarteleraServicio(RepositorioCartelera repositorioCartelera) {
        this.repositorioCartelera = repositorioCartelera;
    }

    public void ejecutar(Long id) {
        this.repositorioCartelera.eliminar(id);
    }
}
