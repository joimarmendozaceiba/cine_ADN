package com.ceiba.pelicula.adaptador.dao;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.pelicula.modelo.dto.PeliculaDTO;
import com.ceiba.pelicula.puerto.dao.PeliculaDAO;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PeliculaDAOMysql implements PeliculaDAO {
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "pelicula", value = "listar")
    private static String sqlListar;

    @SqlStatement(namespace = "pelicula", value = "obtener")
    private static String sqlObtener;

    public PeliculaDAOMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public List<PeliculaDTO> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new PeliculaMapeo());
    }

    @Override
    public PeliculaDTO obtenerPeliculaPorId(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        List<PeliculaDTO> list = this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlObtener, paramSource, new PeliculaMapeo());
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

}
