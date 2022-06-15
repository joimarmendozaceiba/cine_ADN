package com.ceiba.cliente.testdatabuilder;

import com.ceiba.cliente.comando.ComandoCliente;

import java.time.LocalDateTime;

public class ComandoClienteTestDataBuilder {
    private Long id;
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private LocalDateTime fechaNacimiento;
    private String email;
    private String direccion;
    private String telefono;
    private LocalDateTime fechaRegistro;

    private String banco;

    private Long cuentaBancaria;

    public ComandoClienteTestDataBuilder() {
        nombre = "Nicolas";
        tipoDocumento = "cc";
        numeroDocumento = "46541685";
        fechaNacimiento = LocalDateTime.now();
        email = "hola@gmail.com";
        direccion = "casa 3";
        telefono = "3219587525";
        fechaRegistro = LocalDateTime.now().plusDays(4);
        banco = "Banco amigo";
        cuentaBancaria = 1234556L;
    }

    public ComandoCliente build() {
        return new ComandoCliente(id, nombre, tipoDocumento, numeroDocumento, fechaNacimiento, email, direccion, telefono, fechaRegistro, banco, cuentaBancaria);
    }
}
