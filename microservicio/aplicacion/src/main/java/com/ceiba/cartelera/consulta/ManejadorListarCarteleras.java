package com.ceiba.cartelera.consulta;

import com.ceiba.boleto.modelo.dto.BoletoDTO;
import com.ceiba.boleto.puerto.dao.BoletoDAO;
import com.ceiba.cartelera.modelo.dto.CarteleraDTO;
import com.ceiba.cartelera.puerto.dao.CarteleraDAO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarCarteleras {
    private final CarteleraDAO carteleraDAO;

    public ManejadorListarCarteleras(CarteleraDAO carteleraDAO) {
        this.carteleraDAO = carteleraDAO;
    }

    public List<CarteleraDTO> ejecutar() {
        return this.carteleraDAO.listar();
    }
}
