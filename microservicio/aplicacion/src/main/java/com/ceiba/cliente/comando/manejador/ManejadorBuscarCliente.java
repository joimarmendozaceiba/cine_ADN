
package com.ceiba.cliente.comando.manejador;

import com.ceiba.cliente.modelo.dto.ClienteDTO;
import com.ceiba.cliente.puerto.dao.ClienteDAO;
import org.springframework.stereotype.Component;

@Component
public class ManejadorBuscarCliente {

    private final ClienteDAO clienteDAO;
    public ManejadorBuscarCliente(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }


    public ClienteDTO ejecutar(Long id){
        return this.clienteDAO.obtenerClientePorId(id);
    }


}
