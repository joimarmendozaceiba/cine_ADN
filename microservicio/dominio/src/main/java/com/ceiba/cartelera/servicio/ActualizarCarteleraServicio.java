package com.ceiba.cartelera.servicio;

import com.ceiba.cartelera.modelo.entidad.Cartelera;
import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cartelera.utils.MensajesDeExcepcionCartelera;
import com.ceiba.dominio.excepcion.ExcepcionSinDatos;

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
            throw new ExcepcionSinDatos(MensajesDeExcepcionCartelera.NO_EXISTE_UNA_CARTELERA_REGISTRADA_CON_ESTE_ID.getMensaje());
        }
    }
}
