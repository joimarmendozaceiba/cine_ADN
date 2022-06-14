package com.ceiba.cliente.controlador;

import com.ceiba.cliente.comando.manejador.ManejadorBuscarCliente;
import com.ceiba.cliente.consulta.ManejadorListarClientes;
import com.ceiba.cliente.modelo.dto.ClienteDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@Api(tags={"Controlador consulta cliente"})
public class ConsultaControladorCliente {
    private final ManejadorListarClientes manejadorListarClientes;
    private final ManejadorBuscarCliente manejadorBuscarCliente;


    public ConsultaControladorCliente(ManejadorListarClientes manejadorListarClientes, ManejadorBuscarCliente manejadorBuscarCliente) {
        this.manejadorListarClientes = manejadorListarClientes;
        this.manejadorBuscarCliente = manejadorBuscarCliente;
    }


    @GetMapping
    @ApiOperation("Listar clientes")
    public List<ClienteDTO> listar() {
        return this.manejadorListarClientes.ejecutar();
    }

    @GetMapping(value="/{id}")
    @ApiOperation("Buscar clientes")
    public ClienteDTO buscarPorId(@PathVariable Long id) {
        return this.manejadorBuscarCliente.ejecutar(id);
    }
}
