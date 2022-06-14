package com.ceiba.cliente.modelo.entidad;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Cliente {
    private Long id;
    private String nombreCliente;
    private String tipoDocumento;
    private String numeroDocumento;
    private LocalDateTime fechaNacimiento;
    private String email;
    private String direccion;
    private String telefono;
    private LocalDateTime fechaRegistro;

    private String banco;

    private Long cuentaBancaria;

    public Cliente(Long id, String nombreCliente, String tipoDocumento, String numeroDocumento, LocalDateTime fechaNacimiento, String email, String direccion, String telefono, LocalDateTime fechaRegistro, String banco, Long cuentaBancaria) {

        this.id = id;
        this.nombreCliente = nombreCliente;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.banco = banco;
        this.cuentaBancaria = cuentaBancaria;
    }


}
