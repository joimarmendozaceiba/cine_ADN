package com.ceiba.configuracion;

import com.ceiba.boleto.puerto.repositorio.RepositorioBoleto;
import com.ceiba.boleto.servicio.*;
import com.ceiba.cartelera.puerto.repositorio.RepositorioCartelera;
import com.ceiba.cartelera.servicio.ActualizarCarteleraServicio;
import com.ceiba.cartelera.servicio.CrearCarteleraServicio;
import com.ceiba.cartelera.servicio.EliminarCarteleraServicio;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.cliente.servicio.ActualizarClienteServicio;
import com.ceiba.cliente.servicio.CrearClienteServicio;
import com.ceiba.cliente.servicio.EliminarClienteServicio;
import com.ceiba.pelicula.puerto.repositorio.RepositorioPelicula;
import com.ceiba.pelicula.servicio.ActualizarPeliculaServicio;
import com.ceiba.pelicula.servicio.CrearPeliculaServicio;
import com.ceiba.pelicula.servicio.EliminarPeliculaServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {


    @Bean
    public CrearClienteServicio crearClienteServicio(RepositorioCliente repositorioCliente) {
        return new CrearClienteServicio(repositorioCliente);
    }

    @Bean
    public EliminarClienteServicio eliminarClienteServicio(RepositorioCliente repositorioCliente) {
        return new EliminarClienteServicio(repositorioCliente);
    }

    @Bean
    public ActualizarClienteServicio actualizarClienteServicio(RepositorioCliente repositorioCliente) {
        return new ActualizarClienteServicio(repositorioCliente);
    }

    @Bean
    public CrearBoletoServicio crearBoletoServicio (RepositorioBoleto repositorioBoleto,CalcularPrecioBoletoServicio calcularPrecioBoletoServicio) {
        return new CrearBoletoServicio(repositorioBoleto,calcularPrecioBoletoServicio);
    }

    @Bean
    public CrearBoletoClienteServicio crearBoletoClienteServicio (RepositorioBoleto repositorioBoleto, RepositorioCliente repositorioCliente, CalcularPrecioBoletoClienteServicio calcularPrecioBoletoClienteServicio) {
        return new CrearBoletoClienteServicio(repositorioBoleto,repositorioCliente,calcularPrecioBoletoClienteServicio);
    }

    @Bean
    public EliminarBoletoServicio eliminarBoletoServicio(RepositorioBoleto repositorioBoleto) {
        return new EliminarBoletoServicio(repositorioBoleto);
    }

    @Bean
    public CalcularPrecioBoletoServicio calcularPrecioBoletoServicio() {
        return new CalcularPrecioBoletoServicio();
    }

    @Bean
    public CalcularPrecioBoletoClienteServicio calcularPrecioBoletoClienteServicio(RepositorioBoleto repositorioBoleto) {
        return new CalcularPrecioBoletoClienteServicio(repositorioBoleto);
    }

    @Bean
    public CrearCarteleraServicio crearCarteleraServicio(RepositorioCartelera repositorioCartelera){
        return new CrearCarteleraServicio(repositorioCartelera);
    }

    @Bean
    public EliminarCarteleraServicio eliminarCarteleraServicio(RepositorioCartelera repositorioCartelera) {
        return new EliminarCarteleraServicio(repositorioCartelera);
    }

    @Bean
    public ActualizarCarteleraServicio actualizarCarteleraServicio(RepositorioCartelera repositorioCartelera) {
        return new ActualizarCarteleraServicio(repositorioCartelera);
    }


    @Bean
    public CrearPeliculaServicio crearPeliculaServicio(RepositorioPelicula repositorioPelicula){
        return new CrearPeliculaServicio(repositorioPelicula);
    }

    @Bean
    public EliminarPeliculaServicio eliminarPeliculaServicio(RepositorioPelicula repositorioPelicula) {
        return new EliminarPeliculaServicio(repositorioPelicula);
    }

    @Bean
    public ActualizarPeliculaServicio actualizarPeliculaServicio(RepositorioPelicula repositorioPelicula) {
        return new ActualizarPeliculaServicio(repositorioPelicula);
    }


}
