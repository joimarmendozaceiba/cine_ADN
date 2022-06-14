package com.ceiba.boleto.controlador;

import com.ceiba.boleto.consulta.ManejadorListarBoletos;
import com.ceiba.boleto.modelo.dto.BoletoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boletos")
@Api(tags={"Controlador consulta boletos"})
public class ConsultaControladorBoleto {

    private final ManejadorListarBoletos manejadorListarBoletos;

    public ConsultaControladorBoleto(ManejadorListarBoletos manejadorListarBoletos) {
        this.manejadorListarBoletos = manejadorListarBoletos;
    }


    @GetMapping
    @ApiOperation("Listar boletos")
    public List<BoletoDTO> listar() {
        return this.manejadorListarBoletos.ejecutar();
    }

}
