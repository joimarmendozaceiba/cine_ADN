package com.ceiba.boleto.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoBoleto {
    private Long id;
    private Double valor;
    private String nombrePelicula;
    private LocalDateTime fechaFuncion;
    private String pagoBanco;
    private int sedeID;
}
