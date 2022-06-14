package com.ceiba.cartelera.adaptador.repositorio;

import com.ceiba.boleto.modelo.dto.BoletoDTO;
import com.ceiba.cartelera.modelo.dto.CarteleraDTO;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class CarteleraMapeo implements RowMapper<CarteleraDTO>, MapperResult {

    @Override
    public CarteleraDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombreMes = resultSet.getString("nombre_mes");
        int idPelicula = resultSet.getInt("id_pelicula");
        LocalDateTime fechaInicio = extraerLocalDateTime(resultSet, "fecha_inicio");
        LocalDateTime fechaFin = extraerLocalDateTime(resultSet, "fecha_fin");

        return new CarteleraDTO(id, nombreMes, idPelicula, fechaInicio, fechaFin);
    }

}
