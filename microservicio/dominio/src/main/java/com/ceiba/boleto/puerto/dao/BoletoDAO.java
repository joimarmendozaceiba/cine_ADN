package com.ceiba.boleto.puerto.dao;

import com.ceiba.boleto.modelo.dto.BoletoDTO;

import java.util.List;

public interface BoletoDAO {

    /**
     * Permite listar funciones
     *
     * @return las funciones
     */
    List<BoletoDTO> listar();
}
