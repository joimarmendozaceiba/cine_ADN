package com.ceiba.cliente.puerto.repositorio;

import com.ceiba.cliente.modelo.entidad.Cliente;

public interface RepositorioCliente {
    /**
     * Permite crear un afiliado
     *
     * @param cliente
     * @return el id generado
     */
    Long crear(Cliente cliente);

    /**
     * Permite actualizar un afiliado
     *
     * @param cliente
     */
    void actualizar(Cliente cliente);

    /**
     * Permite eliminar un cliente
     *
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un cliente dado su id
     *
     * @param id
     * @return si existe o no
     */
    boolean existe(Long id);
}
