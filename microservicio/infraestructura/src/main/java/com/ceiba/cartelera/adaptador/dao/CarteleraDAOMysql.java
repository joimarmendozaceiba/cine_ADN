package com.ceiba.cartelera.adaptador.dao;

import com.ceiba.cartelera.adaptador.repositorio.CarteleraMapeo;
import com.ceiba.cartelera.modelo.dto.CarteleraDTO;
import com.ceiba.cartelera.puerto.dao.CarteleraDAO;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarteleraDAOMysql implements CarteleraDAO {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "cartelera", value = "listar")
    private static String sqlListar;

    @SqlStatement(namespace = "cartelera", value = "obtener")
    private static String sqlObtener;

    public CarteleraDAOMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public List<CarteleraDTO> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new CarteleraMapeo());
    }
}
