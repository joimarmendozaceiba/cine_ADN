package com.ceiba.cliente.servicio.testdatabuilder;

import com.ceiba.cliente.modelo.entidad.Cliente;

import java.time.LocalDateTime;

public class ClienteTestDataBuilder {

    private  Long id;
    private  String nombre;
    private  String tipoDocumento;
    private  String numeroDocumento;
    private  LocalDateTime fechaNacimiento;
    private  String email;
    private  String direccion;
    private  String telefono;
    private  LocalDateTime fechaRegistro;

    private String banco;

    private Long cuentaBancaria;

    public ClienteTestDataBuilder() {
        id = 1L;
        nombre = "Francisco";
        tipoDocumento = "cc";
        numeroDocumento = "46541685";
        fechaNacimiento = LocalDateTime.now();
        email = "correo@gmail.com";
        direccion = "calle 123";
        telefono = "321555555";
        fechaRegistro = LocalDateTime.now().plusDays(4);
        banco = "Banco amigo";
        cuentaBancaria = 1234567890L;

    }

    public Cliente build() {
        return new Cliente(id,nombre,tipoDocumento,numeroDocumento,fechaNacimiento,email,direccion,telefono,fechaRegistro,banco,cuentaBancaria );
    }
}
