package com.ceiba.cartelera.utils;

import lombok.Getter;

@Getter
public enum MensajesDeExcepcionCartelera {

    REGEX_CORREO("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$"),
    SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_CARTELERA("Se debe ingresar el nombre de la cartelera"),
    SE_DEBE_INGRESAR_EL_TIPO_DE_DOCUMENTO_DEL_AFILIADO("Se debe ingresar el tipo de documento del afiliado"),
    SE_DEBE_INGRESAR_EL_NUMERO_DE_DOCUMENTO_DEL_AFILIADO("Se debe ingresar el numero de documento del afiliado"),
    SE_DEBE_INGRESAR_EL_EMAIL_DEL_AFILIADO("Se debe ingresar el email del afiliado"),
    SE_DEBE_INGRESAR_UN_EMAIL_VALIDO("Se debe ingresar un email valido con una estructura como la siguiente (ceiba@mail.com)"),

    YA_EXISTE_UNA_CARTELERA_REGISTRADA_CON_ESTE_ID("Ya existe una cartelera con este id"),
    NO_EXISTE_UNA_CARTELERA_REGISTRADA_CON_ESTE_ID("No existe una cartelera con este id");

    private  String mensaje;

    MensajesDeExcepcionCartelera(String mensaje){
        this.mensaje=mensaje;
    }
}
