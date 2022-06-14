package com.ceiba.cliente.consulta;

import com.ceiba.cliente.modelo.dto.ClienteDTO;
import com.ceiba.cliente.puerto.dao.ClienteDAO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarClientes {
    private final ClienteDAO clienteDAO;

    public ManejadorListarClientes(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public List<ClienteDTO> ejecutar() {
        return this.clienteDAO.listar();
    }
}
