package com.ceiba.cartelera.servicio;

import com.ceiba.cartelera.modelo.entidad.Cartelera;
import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;

public class ActualizarCarteleraServicio {

    private final RepositorioCartelera repositorioCartelera;

    public ActualizarCarteleraServicio(RepositorioCartelera repositorioCartelera) {
        this.repositorioCartelera = repositorioCartelera;
    }

    public void ejecutar(Cartelera cartelera) {
        validarExistenciaPrevia(cartelera);
        this.repositorioCartelera.actualizar(cartelera);
    }

    private void validarExistenciaPrevia(Cartelera cartelera) {
        boolean existe = this.repositorioCartelera.existe(cartelera.getId());
        if (!existe) {
//            throw new ExcepcionSinDatos(MensajesDeExcepcion.NO_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID.getMensaje());
        }
    }
}
