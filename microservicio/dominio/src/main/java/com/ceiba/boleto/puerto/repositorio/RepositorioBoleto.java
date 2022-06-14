package com.ceiba.boleto.puerto.repositorio;

import com.ceiba.boleto.modelo.entidad.Boleto;

public interface RepositorioBoleto {
    /**
     * Permite crear una boleto
     *
     * @param boleto
     * @return el id generado
     */
    Long crear(Boleto boleto);

    /**
     * Permite eliminar la compra de un boleto
     *
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite verificar si existe un boleto
     *
     * @param id
     */
    boolean existe(Long id);
}
