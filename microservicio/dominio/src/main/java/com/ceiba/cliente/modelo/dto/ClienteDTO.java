package com.ceiba.cliente.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ClienteDTO {
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
}
