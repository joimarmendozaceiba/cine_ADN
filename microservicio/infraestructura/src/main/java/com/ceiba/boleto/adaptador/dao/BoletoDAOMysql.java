package com.ceiba.boleto.adaptador.dao;

import com.ceiba.boleto.adaptador.repositorio.BoletoMapeo;
import com.ceiba.boleto.modelo.dto.BoletoDTO;
import com.ceiba.boleto.puerto.dao.BoletoDAO;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoletoDAOMysql implements BoletoDAO {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= "boleto", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace= "boleto", value="obtener")
    private static String sqlObtener;

    public BoletoDAOMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public List<BoletoDTO> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new BoletoMapeo());
    }

}
