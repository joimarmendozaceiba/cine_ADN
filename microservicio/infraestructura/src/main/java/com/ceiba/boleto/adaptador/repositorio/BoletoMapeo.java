package com.ceiba.boleto.adaptador.repositorio;

import com.ceiba.boleto.modelo.dto.BoletoDTO;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class BoletoMapeo implements RowMapper<BoletoDTO>, MapperResult {

    @Override
    public BoletoDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        Double valorTotal = resultSet.getDouble("valor");
        String nombrePelicula = resultSet.getString("nombre_pelicula");
        LocalDateTime fechaFuncion = extraerLocalDateTime(resultSet, "fecha_funcion");
        String pagoBanco = resultSet.getString("pago_banco");
        int sedeID = resultSet.getInt("sede_id");


        return new BoletoDTO(id, valorTotal, nombrePelicula, fechaFuncion, pagoBanco, sedeID);
    }

}
