package com.ceiba.cartelera.servicio;

import com.ceiba.cartelera.modelo.entidad.Cartelera;
import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cartelera.utils.MensajesDeExcepcionCartelera;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;

public class CrearCarteleraServicio {
    private final RepositorioCartelera repositorioCartelera;

    public CrearCarteleraServicio(RepositorioCartelera repositorioCartelera) {
        this.repositorioCartelera = repositorioCartelera;
    }

    public Long ejecutar(Cartelera cartelera) {
        validarExistenciaPrevia(cartelera);
        return this.repositorioCartelera.crear(cartelera);
    }

    private void validarExistenciaPrevia(Cartelera cartelera) {
        boolean existe = this.repositorioCartelera.existe(cartelera.getId());
        if (existe) {
            throw new ExcepcionValorInvalido(MensajesDeExcepcionCartelera.YA_EXISTE_UNA_CARTELERA_REGISTRADA_CON_ESTE_ID.getMensaje());
        }
    }
}
