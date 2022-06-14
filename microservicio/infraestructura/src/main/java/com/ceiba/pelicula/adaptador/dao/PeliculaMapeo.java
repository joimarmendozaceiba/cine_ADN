package com.ceiba.pelicula.adaptador.dao;

import com.ceiba.cliente.modelo.dto.ClienteDTO;
import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.pelicula.modelo.dto.PeliculaDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class PeliculaMapeo implements RowMapper<PeliculaDTO>, MapperResult  {
    @Override
    public PeliculaDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombrePelicula = resultSet.getString("nombre_pelicula");
        String genero = resultSet.getString("genero");
        int duracion = resultSet.getInt("duracion");
        LocalDateTime año = extraerLocalDateTime(resultSet, "descripcion");
        String descripcion = resultSet.getString("año");
        String director = resultSet.getString("director");

        return new PeliculaDTO(id, nombrePelicula, genero, duracion, año, descripcion, director);
    }
}
