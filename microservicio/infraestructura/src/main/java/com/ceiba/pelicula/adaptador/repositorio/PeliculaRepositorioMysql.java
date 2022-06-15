package com.ceiba.pelicula.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.pelicula.modelo.entidad.Pelicula;
import com.ceiba.pelicula.puerto.repositorio.RepositorioPelicula;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class PeliculaRepositorioMysql implements RepositorioPelicula {
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "pelicula", value = "crear")
    private static String sqlCrear;

    @SqlStatement(namespace = "pelicula", value = "actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace = "pelicula", value = "eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace = "pelicula", value = "existe")
    private static String sqlExiste;


    public PeliculaRepositorioMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }


    @Override
    public Long crear(Pelicula pelicula) {
        return this.customNamedParameterJdbcTemplate.crear(pelicula, sqlCrear);
    }

    @Override
    public void actualizar(Pelicula pelicula) {
        this.customNamedParameterJdbcTemplate.actualizar(pelicula, sqlActualizar);
    }

    @Override
    public void eliminar(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);
    }

    @Override
    public boolean existe(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste, paramSource, Boolean.class);
    }
}
