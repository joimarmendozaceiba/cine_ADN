package com.ceiba.cartelera.servicio;

import com.ceiba.cartelera.modelo.entidad.Cartelera;
import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;

public class CrearCarteleraServicio {
    private final RepositorioCartelera repositorioCartelera;

    public CrearCarteleraServicio( RepositorioCartelera repositorioCartelera) {
        this.repositorioCartelera = repositorioCartelera;
    }

    public Long ejecutar(Cartelera cartelera) {
        validarExistenciaPrevia(cartelera);
        return this.repositorioCartelera.crear(cartelera);
    }

    private void validarExistenciaPrevia(Cartelera cartelera) {
        boolean existe = this.repositorioCartelera.existe(cartelera.getId());
        if (existe) {
//            throw new ExcepcionValorInvalido(MensajesDeExcepcion.YA_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID.getMensaje());
        }
    }
}
