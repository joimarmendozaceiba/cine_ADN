package com.ceiba.cliente.puerto.dao;

import com.ceiba.cliente.modelo.dto.ClienteDTO;

import java.util.List;

public interface ClienteDAO {
    /**
     * Permite listar clientes
     *
     * @return los clientes
     */
    List<ClienteDTO> listar();

    ClienteDTO obtenerClientePorId(Long id);
}
