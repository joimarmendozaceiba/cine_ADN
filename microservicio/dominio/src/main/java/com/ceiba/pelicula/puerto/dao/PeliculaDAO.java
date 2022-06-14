package com.ceiba.pelicula.puerto.dao;

import com.ceiba.pelicula.modelo.dto.PeliculaDTO;

import java.util.List;

public interface PeliculaDAO {
    /**
     * Permite listar clientes
     *
     * @return los clientes
     */
    List<PeliculaDTO> listar();

    PeliculaDTO obtenerPeliculaPorId(Long id);
}
