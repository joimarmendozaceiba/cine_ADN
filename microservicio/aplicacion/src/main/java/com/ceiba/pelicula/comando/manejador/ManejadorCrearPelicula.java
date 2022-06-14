package com.ceiba.pelicula.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.cliente.comando.ComandoCliente;
import com.ceiba.cliente.comando.fabrica.FabricaCliente;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.servicio.CrearClienteServicio;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.pelicula.comando.ComandoPelicula;
import com.ceiba.pelicula.comando.fabrica.FabricaPelicula;
import com.ceiba.pelicula.modelo.entidad.Pelicula;
import com.ceiba.pelicula.servicio.CrearPeliculaServicio;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPelicula implements ManejadorComandoRespuesta<ComandoPelicula, ComandoRespuesta<Long>> {
    private final FabricaPelicula fabricaPelicula;
    private final CrearPeliculaServicio crearPeliculaServicio;

    public ManejadorCrearPelicula(FabricaPelicula fabricaPelicula, CrearPeliculaServicio crearPeliculaServicio) {
        this.fabricaPelicula = fabricaPelicula;
        this.crearPeliculaServicio = crearPeliculaServicio;
    }

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoPelicula comando) {
        Pelicula pelicula = this.fabricaPelicula.crear(comando);
        return new ComandoRespuesta<>(this.crearPeliculaServicio.ejecutar(pelicula));
    }
}
