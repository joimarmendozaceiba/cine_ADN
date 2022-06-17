package com.ceiba.cartelera.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.cartelera.comando.ComandoCartelera;
import com.ceiba.cartelera.comando.manejador.ManejadorCrearCartelera;
import com.ceiba.cartelera.comando.manejador.ManejadorEliminarCartelera;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carteleras")
@Api(tags = {"Controllable comando cartelera"})
public class ComandoControladorCartelera {

    private final ManejadorCrearCartelera manejadorCrearCartelera;
    private final ManejadorEliminarCartelera manejadorEliminarCartelera;

    @Autowired
    public ComandoControladorCartelera(ManejadorCrearCartelera manejadorCrearCartelera, ManejadorEliminarCartelera manejadorEliminarCartelera) {
        this.manejadorCrearCartelera = manejadorCrearCartelera;
        this.manejadorEliminarCartelera = manejadorEliminarCartelera;
    }


    @PostMapping
    @ApiOperation("Crear cartelera")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoCartelera comandoCartelera) {
        return manejadorCrearCartelera.ejecutar(comandoCartelera);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation("Eliminar cartelera")
    public void eliminar(@PathVariable Long id) {
        manejadorEliminarCartelera.ejecutar(id);
    }


}
