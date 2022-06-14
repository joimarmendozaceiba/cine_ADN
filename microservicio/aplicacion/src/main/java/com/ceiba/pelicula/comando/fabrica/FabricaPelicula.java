package com.ceiba.pelicula.comando.fabrica;

import com.ceiba.pelicula.comando.ComandoPelicula;
import com.ceiba.pelicula.modelo.entidad.Pelicula;
import org.springframework.stereotype.Component;

@Component
public class FabricaPelicula {
    public Pelicula crear(ComandoPelicula comandoPelicula) {
        return new Pelicula(
                comandoPelicula.getId(),
                comandoPelicula.getNombrePelicula(),
                comandoPelicula.getGenero(),
                comandoPelicula.getDuracion(),
                comandoPelicula.getAño(),
                comandoPelicula.getDescripcion(),
                comandoPelicula.getDirector()
        );
    }
}
