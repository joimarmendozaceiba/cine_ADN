package com.ceiba.pelicula.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.pelicula.comando.ComandoPelicula;
import com.ceiba.pelicula.comando.fabrica.FabricaPelicula;
import com.ceiba.pelicula.modelo.entidad.Pelicula;
import com.ceiba.pelicula.servicio.ActualizarPeliculaServicio;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarPelicula implements ManejadorComando<ComandoPelicula> {

    private final FabricaPelicula fabricaPelicula;
    private final ActualizarPeliculaServicio actualizarPeliculaServicio;

    public ManejadorActualizarPelicula(FabricaPelicula fabricaPelicula, ActualizarPeliculaServicio actualizarPeliculaServicio) {
        this.fabricaPelicula = fabricaPelicula;
        this.actualizarPeliculaServicio = actualizarPeliculaServicio;
    }

    public void ejecutar(ComandoPelicula comandoPelicula) {
        Pelicula pelicula = this.fabricaPelicula.crear(comandoPelicula);
        this.actualizarPeliculaServicio.ejecutar(pelicula);
    }


}
