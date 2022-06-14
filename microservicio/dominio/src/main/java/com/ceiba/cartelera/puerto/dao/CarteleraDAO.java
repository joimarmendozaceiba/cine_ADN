package com.ceiba.cartelera.puerto.dao;

import com.ceiba.boleto.modelo.dto.BoletoDTO;
import com.ceiba.cartelera.modelo.dto.CarteleraDTO;

import java.util.List;

public interface CarteleraDAO {

    /**
     * Permite listar funciones
     *
     * @return las funciones
     */
    List<CarteleraDTO> listar();
}
