
package com.ceiba.pelicula.comando.manejador;

import com.ceiba.cliente.modelo.dto.ClienteDTO;
import com.ceiba.cliente.puerto.dao.ClienteDAO;
import com.ceiba.pelicula.modelo.dto.PeliculaDTO;
import com.ceiba.pelicula.puerto.dao.PeliculaDAO;
import org.springframework.stereotype.Component;

@Component
public class ManejadorBuscarPelicula {

    private final PeliculaDAO peliculaDAO;
    public ManejadorBuscarPelicula(PeliculaDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }


    public PeliculaDTO ejecutar(Long id){
        return this.peliculaDAO.obtenerPeliculaPorId(id);
    }


}
