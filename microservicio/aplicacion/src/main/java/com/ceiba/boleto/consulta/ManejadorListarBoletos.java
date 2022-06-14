package com.ceiba.boleto.consulta;

import com.ceiba.boleto.modelo.dto.BoletoDTO;
import com.ceiba.boleto.puerto.dao.BoletoDAO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarBoletos {
    private final BoletoDAO boletoDAO;

    public ManejadorListarBoletos(BoletoDAO boletoDAO) {
        this.boletoDAO = boletoDAO;
    }

    public List<BoletoDTO> ejecutar() {
        return this.boletoDAO.listar();
    }
}
