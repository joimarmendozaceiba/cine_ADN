package com.ceiba.boleto.utils;

import lombok.Getter;

@Getter
public enum MensajesDeExcepcionBoleto {
    SE_DEBE_INGRESAR_EL_NUMERO_DE_LA_FUNCION("Se debe ingresar el numero de la funcion del dia"),
    SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_FUNCION("Se debe ingresar el nombre de la funcion"),
    SE_DEBE_INGRESAR_EL_PRECIO_DE_LA_ENTRADA("Se debe ingresar el precio de la entrada"),
    EL_PRECIO_DE_LA_ENTRADA_DEBE_SER_POSITIVO("El precio del Boleto debe ser positivo"),
    EL_NUMERO_DE_FUNCION_DE_LA_ENTRADA_DEBE_SER_POSITIVO("El numero de funcion de la entrada debe ser positivo"),
    SE_DEBE_INGRESAR_LA_FECHA_DE_LA_FUNCION("Se debe ingresar la fecha de la funcion de la pelicula"),

    YA_EXISTE_UNA_ENTRADA_REGISTRADA_CON_ESTE_ID("Boleto no disponible a la venta"),
    NO_EXISTE_UNA_ENTRADA_REGISTRADA_CON_ESTE_ID("La entrada no existe");




    private  String mensaje;

    MensajesDeExcepcionBoleto(String mensaje){
        this.mensaje=mensaje;
    }
}
