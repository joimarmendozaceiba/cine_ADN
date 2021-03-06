package com.ceiba.cliente.servicio;

import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.utils.MensajesDeExcepcionCliente;
import com.ceiba.dominio.excepcion.ExcepcionSinDatos;

public class ActualizarClienteServicio {

    private final RepositorioCliente repositorioCliente;

    public ActualizarClienteServicio(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente) {
        validarExistenciaPrevia(cliente);
        this.repositorioCliente.actualizar(cliente);
    }

    private void validarExistenciaPrevia(Cliente cliente) {
        boolean existe = this.repositorioCliente.existe(cliente.getId());
        if (!existe) {
            throw new ExcepcionSinDatos(MensajesDeExcepcionCliente.NO_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID.getMensaje());
        }
    }
}
