package com.ceiba.pelicula.controlador;

import com.ceiba.cliente.comando.manejador.ManejadorBuscarCliente;
import com.ceiba.cliente.consulta.ManejadorListarClientes;
import com.ceiba.cliente.modelo.dto.ClienteDTO;
import com.ceiba.pelicula.comando.manejador.ManejadorBuscarPelicula;
import com.ceiba.pelicula.consulta.ManejadorListarPeliculas;
import com.ceiba.pelicula.modelo.dto.PeliculaDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
@Api(tags={"Controlador consulta pelicula"})
public class ConsultaControladorPelicula {
    private final ManejadorListarPeliculas manejadorListarPeliculas;
    private final ManejadorBuscarPelicula manejadorBuscarPelicula;


    public ConsultaControladorPelicula(ManejadorListarPeliculas manejadorListarPeliculas, ManejadorBuscarPelicula manejadorBuscarPelicula) {
        this.manejadorListarPeliculas = manejadorListarPeliculas;
        this.manejadorBuscarPelicula = manejadorBuscarPelicula;
    }


    @GetMapping
    @ApiOperation("Listar peliculas")
    public List<PeliculaDTO> listar() {
        return this.manejadorListarPeliculas.ejecutar();
    }

    @GetMapping(value="/{id}")
    @ApiOperation("Buscar peliculas")
    public PeliculaDTO buscarPorId(@PathVariable Long id) {
        return this.manejadorBuscarPelicula.ejecutar(id);
    }
}
