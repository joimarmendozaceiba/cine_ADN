package com.ceiba.pelicula.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.cliente.comando.ComandoCliente;
import com.ceiba.cliente.comando.manejador.ManejadorActualizarCliente;
import com.ceiba.cliente.comando.manejador.ManejadorCrearCliente;
import com.ceiba.cliente.comando.manejador.ManejadorEliminarCliente;
import com.ceiba.pelicula.comando.ComandoPelicula;
import com.ceiba.pelicula.comando.manejador.ManejadorActualizarPelicula;
import com.ceiba.pelicula.comando.manejador.ManejadorCrearPelicula;
import com.ceiba.pelicula.comando.manejador.ManejadorEliminarPelicula;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/peliculas")
@Api(tags = { "Controlador comando peliculas"})
public class ComandoControladorPelicula {

    private final ManejadorCrearPelicula manejadorCrearPelicula;
    private final ManejadorEliminarPelicula manejadorEliminarPelicula;
    private final ManejadorActualizarPelicula manejadorActualizarPelicula;

    @Autowired
    public ComandoControladorPelicula(ManejadorCrearPelicula manejadorCrearPelicula,
                                      ManejadorEliminarPelicula manejadorEliminarPelicula,
                                      ManejadorActualizarPelicula manejadorActualizarPelicula) {
        this.manejadorCrearPelicula = manejadorCrearPelicula;
        this.manejadorEliminarPelicula = manejadorEliminarPelicula;
        this.manejadorActualizarPelicula = manejadorActualizarPelicula;
    }

    @PostMapping
    @ApiOperation("Crear pelicula")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoPelicula comandoPelicula) {
        return manejadorCrearPelicula.ejecutar(comandoPelicula);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation("Eliminar pelicula")
    public void eliminar(@PathVariable Long id) {
        manejadorEliminarPelicula.ejecutar(id);
    }

    @PutMapping
    @ApiOperation("Actualizar pelicula")
    public void actualizar(@RequestBody ComandoPelicula comandoPelicula) {
        manejadorActualizarPelicula.ejecutar(comandoPelicula);
    }

}
