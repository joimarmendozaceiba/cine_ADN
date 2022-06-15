package com.ceiba.pelicula.consulta;

import com.ceiba.pelicula.modelo.dto.PeliculaDTO;
import com.ceiba.pelicula.puerto.dao.PeliculaDAO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarPeliculas {
    private final PeliculaDAO peliculaDAO;

    public ManejadorListarPeliculas(PeliculaDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }

    public List<PeliculaDTO> ejecutar() {
        return this.peliculaDAO.listar();
    }
}
