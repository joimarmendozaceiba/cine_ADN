package com.ceiba.pelicula.utils;

import lombok.Getter;

@Getter
public enum MensajesDeExcepcion {

    REGEX_CORREO("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$"),
    SE_DEBE_INGRESAR_EL_NOMBRE_DE_PELICULA("Se debe ingresar el nombre de la pelicula"),
    SE_DEBE_INGRESAR_EL_TIPO_DE_GENERO("Se debe ingresar el tipo de genero de la pelicula"),
    SE_DEBE_INGRESAR_EL_NUMERO_DE_MINUTOS_PELICULA("Se debe ingresar el numero minutos de la pelicula"),
    SE_DEBE_INGRESAR_EL_AÑO_PELICULA("Se debe ingresar el año de la pelicula de estreno"),
    SE_DEBE_INGRESAR_UNA_DESCRIPCION("Se debe ingresar una descripcion para la pelicula"),
    SE_DEBE_INGRESAR_DIRECTOR_DE_PELICULA("Se debe ingresar el director de la pelicula"),
    LA_FECHA_DE_ESTRENO_NO_PUEDE_SER_MAYOR_A_LA_FECHA_ACTUAL("Fecha de estreno mayor a la actual"),
    YA_EXISTE_UNA_PELICULA_REGISTRADA_CON_ESTE_NOMBRE("Ya existe unA pelicula con este nombre"),
    YA_EXISTE_UNA_PELICULA_REGISTRADA_CON_ESTE_ID("Ya existe una pelicula con este id"),
    NO_EXISTE_UNA_PELICULA_REGISTRADA_CON_ESTE_ID("No existe una pelicula con este id");

    private  String mensaje;

    MensajesDeExcepcion(String mensaje){
        this.mensaje=mensaje;
    }
}
