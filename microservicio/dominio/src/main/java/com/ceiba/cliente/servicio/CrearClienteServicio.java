package com.ceiba.cliente.servicio;

import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.utils.MensajesDeExcepcion;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;

public class CrearClienteServicio {
    private final RepositorioCliente repositorioCliente;

    public CrearClienteServicio(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public Long ejecutar(Cliente cliente) {
        validarExistenciaPrevia(cliente);
        return this.repositorioCliente.crear(cliente);
    }

    private void validarExistenciaPrevia(Cliente cliente) {
        boolean existe = this.repositorioCliente.existe(cliente.getId());
        if (existe) {
            throw new ExcepcionValorInvalido(MensajesDeExcepcion.YA_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID.getMensaje());
        }
    }
}
