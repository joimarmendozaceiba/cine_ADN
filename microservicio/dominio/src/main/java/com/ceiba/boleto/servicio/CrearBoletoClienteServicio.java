package com.ceiba.boleto.servicio;

import com.ceiba.boleto.modelo.entidad.Boleto;
import com.ceiba.boleto.puerto.repositorio.RepositorioBoleto;
import com.ceiba.cliente.modelo.entidad.Cliente;
import com.ceiba.cliente.puerto.repositorio.RepositorioCliente;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;

public class CrearBoletoClienteServicio {
    private RepositorioBoleto repositorioBoleto;
    private RepositorioCliente repositorioCliente;

    private CalcularPrecioBoletoClienteServicio calcularPrecioBoletoClienteServicio;

    public CrearBoletoClienteServicio(RepositorioBoleto repositorioBoleto, RepositorioCliente repositorioCliente, CalcularPrecioBoletoClienteServicio calcularPrecioBoletoClienteServicio) {
        this.repositorioBoleto = repositorioBoleto;
        this.repositorioCliente = repositorioCliente;
        this.calcularPrecioBoletoClienteServicio = calcularPrecioBoletoClienteServicio;
    }

    public Long ejecutar(Boleto boleto, Cliente cliente) {
        validarEntradaPrevia(boleto);
        validarExistenciaAfiliado(cliente.getId());
        boleto.setPrecio(calcularPrecioBoletoClienteServicio.ejecutar(boleto, cliente));
        return this.repositorioBoleto.crear(boleto);
    }

    private void validarEntradaPrevia(Boleto boleto) {
        boolean existe = this.repositorioBoleto.existe(boleto.getId());
        if (existe) {
//            throw new ExcepcionDuplicidad(MensajesDeExcepcionEntrada.YA_EXISTE_UNA_ENTRADA_REGISTRADA_CON_ESTE_ID.getMensaje());
        }
    }

    private void validarExistenciaAfiliado(Long id) {
        boolean existe = this.repositorioCliente.existe(id);
        if (!existe) {
//            throw new ExcepcionDuplicidad(MensajesDeExcepcion.NO_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_NUMERO_Y_TIPO_DE_DOCUMENTO.getMensaje());
        }
    }


}
