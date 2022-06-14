package com.ceiba.cliente.adaptador.dao;

import ch.qos.logback.core.net.server.Client;
import com.ceiba.cliente.modelo.dto.ClienteDTO;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ClienteMapeo implements RowMapper<ClienteDTO>, MapperResult  {
    @Override
    public ClienteDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombreCliente = resultSet.getString("nombre");
        String tipoDocumento = resultSet.getString("tipoDocumento");
        String numeroDocumento = resultSet.getString("numeroDocumento");
        LocalDateTime fechaNacimiento = extraerLocalDateTime(resultSet, "fechaNacimiento");
        String email = resultSet.getString("email");
        String direccion = resultSet.getString("direccion");
        String telefono = resultSet.getString("telefono");
        String banco = resultSet.getString("banco");
        LocalDateTime fechaRegistro = extraerLocalDateTime(resultSet, "fechaRegistro");
        Long cuentaBancaria = resultSet.getLong("cuenta_bancaria");

        return new ClienteDTO(id, nombreCliente, tipoDocumento, numeroDocumento, fechaNacimiento, email, direccion,
                telefono, fechaRegistro, banco, cuentaBancaria);
    }
}
