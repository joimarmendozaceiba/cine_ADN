package com.ceiba.cliente.servicio.modelo;

import com.ceiba.cliente.modelo.dto.ClienteDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class ClienteTest {

    @Test
    void validarCreacionExitos() {
        Long id = 1L;
        String nombre = "Ortencio";
        String tipoDocumento = "cc";
        String numeroDocumento = "46541685";
        LocalDateTime fechaNacimiento = LocalDateTime.now();
        String email = "hola@gmail.com";
        String direccion = "casa 3";
        String telefono = "3219587525";
        LocalDateTime fechaRegistro = LocalDateTime.now().plusDays(4);
        String banco = "Banco amigo";
        Long cuentaBancaria = 1234556L;

        ClienteDTO cliente = new ClienteDTO(id, nombre, tipoDocumento, numeroDocumento, fechaNacimiento, email, direccion, telefono, fechaRegistro, banco, cuentaBancaria);

        Assertions.assertEquals(1, cliente.getId());
        Assertions.assertEquals("Ortencio", cliente.getNombreCliente());
        Assertions.assertEquals("cc", cliente.getTipoDocumento());
        Assertions.assertEquals("46541685", cliente.getNumeroDocumento());
        Assertions.assertEquals("hola@gmail.com", cliente.getEmail());
        Assertions.assertEquals("casa 3", cliente.getDireccion());
        Assertions.assertEquals("3219587525", cliente.getTelefono());
        Assertions.assertEquals("Banco amigo", cliente.getBanco());
        Assertions.assertEquals(1234556, cliente.getCuentaBancaria());

    }

}
