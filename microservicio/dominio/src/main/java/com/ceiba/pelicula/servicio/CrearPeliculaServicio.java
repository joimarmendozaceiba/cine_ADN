package com.ceiba.pelicula.servicio;

import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import com.ceiba.pelicula.modelo.entidad.Pelicula;
import com.ceiba.pelicula.puerto.repositorio.RepositorioPelicula;
import com.ceiba.pelicula.utils.MensajesDeExcepcion;

public class CrearPeliculaServicio {
    private final RepositorioPelicula repositorioPelicula;

    public CrearPeliculaServicio(RepositorioPelicula repositorioPelicula) {
        this.repositorioPelicula = repositorioPelicula;
    }

    public Long ejecutar(Pelicula pelicula) {
        validarExistenciaPrevia(pelicula);
        return this.repositorioPelicula.crear(pelicula);
    }

    private void validarExistenciaPrevia(Pelicula pelicula) {
        boolean existe = this.repositorioPelicula.existe(pelicula.getId());
        if (existe) {
            throw new ExcepcionValorInvalido(MensajesDeExcepcion.YA_EXISTE_UNA_PELICULA_REGISTRADA_CON_ESTE_ID.getMensaje());
        }
    }
}
