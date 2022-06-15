package com.ceiba.cartelera.puerto.repositorio;

import com.ceiba.cartelera.modelo.entidad.Cartelera;

public interface RepositorioCartelera {
    /**
     * Permite crear una entrada
     *
     * @param cartelera
     * @return el id generado
     */
    Long crear(Cartelera cartelera);

    /**
     * Permite eliminar la compra de una cartelera
     *
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite actualizar una cartelera
     *
     * @param cartelera
     */
    void actualizar(Cartelera cartelera);

    /**
     * Permite verificar si existe una cartelera
     *
     * @param id
     */
    boolean existe(Long id);
}
