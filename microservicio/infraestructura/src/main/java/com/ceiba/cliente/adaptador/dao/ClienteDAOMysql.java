package com.ceiba.cliente.adaptador.dao;

import com.ceiba.cliente.modelo.dto.ClienteDTO;
import com.ceiba.cliente.puerto.dao.ClienteDAO;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteDAOMysql implements ClienteDAO {
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="cliente", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace="cliente", value="obtener")
    private static String sqlObtener;

    public ClienteDAOMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public List<ClienteDTO> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new ClienteMapeo());
    }

    @Override
    public ClienteDTO obtenerClientePorId(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        List<ClienteDTO> list=this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlObtener, paramSource, new ClienteMapeo());
        if(list.size()==1){
            return list.get(0);
        }
        return null;
    }

}
