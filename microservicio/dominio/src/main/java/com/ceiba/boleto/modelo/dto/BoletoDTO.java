package com.ceiba.boleto.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class BoletoDTO {
    private Long id;
    private Double valor;
    private String nombrePelicula;
    private LocalDateTime fechaFuncion;
    private String pagoBanco;
    private int sedeID;
}
