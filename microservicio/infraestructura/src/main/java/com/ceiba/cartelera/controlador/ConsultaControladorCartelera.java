package com.ceiba.cartelera.controlador;

import com.ceiba.boleto.consulta.ManejadorListarBoletos;
import com.ceiba.boleto.modelo.dto.BoletoDTO;
import com.ceiba.cartelera.consulta.ManejadorListarCarteleras;
import com.ceiba.cartelera.modelo.dto.CarteleraDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carteleras")
@Api(tags={"Controlador consulta carteleras"})
public class ConsultaControladorCartelera {

    private final ManejadorListarCarteleras manejadorListarCarteleras;

    public ConsultaControladorCartelera(ManejadorListarCarteleras manejadorListarCarteleras) {
        this.manejadorListarCarteleras = manejadorListarCarteleras;
    }


    @GetMapping
    @ApiOperation("Listar carteleras")
    public List<CarteleraDTO> listar() {
        return this.manejadorListarCarteleras.ejecutar();
    }

}
