package com.ceiba.boleto.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.boleto.comando.ComandoBoleto;
import com.ceiba.boleto.comando.manejador.ManejadorCalcularPrecioBoleto;
import com.ceiba.boleto.comando.manejador.ManejadorCrearBoleto;
import com.ceiba.boleto.comando.manejador.ManejadorEliminarBoleto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entradas")
@Api(tags = { "Controllable comando entrada"})
public class ComandoControladorBoleto {

    private final ManejadorCrearBoleto manejadorCrearBoleto;
    private final ManejadorEliminarBoleto manejadorEliminarBoleto;
    private final ManejadorCalcularPrecioBoleto manejadorCalcularPrecioBoleto;

	@Autowired
	public ComandoControladorBoleto(ManejadorCrearBoleto manejadorCrearBoleto,  ManejadorEliminarBoleto manejadorEliminarBoleto, ManejadorCalcularPrecioBoleto manejadorCalcularPrecioBoleto) {
		this.manejadorCrearBoleto = manejadorCrearBoleto;
		this.manejadorEliminarBoleto = manejadorEliminarBoleto;
		this.manejadorCalcularPrecioBoleto = manejadorCalcularPrecioBoleto;
	}


    @PostMapping
    @ApiOperation("Crear Entrada")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoBoleto comandoBoleto) {
        return manejadorCrearBoleto.ejecutar(comandoBoleto);
    }

    @DeleteMapping(value="/{id}")
	@ApiOperation("Eliminar Entrada")
	public void eliminar(@PathVariable Long id) {
		manejadorEliminarBoleto.ejecutar(id);
	}


	@PostMapping(value="/precio-entrada")
	@ApiOperation("Calcular precio entrada")
	public ComandoRespuesta<Double> calcularPrecio(@RequestBody ComandoBoleto comandoBoleto) {
		return manejadorCalcularPrecioBoleto.ejecutar(comandoBoleto);
	}


}
