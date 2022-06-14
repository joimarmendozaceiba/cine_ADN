package com.ceiba.cliente.servicio;

import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;

public class EliminarClienteServicio {
    private final RepositorioCliente repositorioCliente;

    public EliminarClienteServicio(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Long id) {
        this.repositorioCliente.eliminar(id);
    }
}
