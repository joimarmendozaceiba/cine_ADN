package com.ceiba.cliente.utils;

import lombok.Getter;

@Getter
public enum MensajesDeExcepcionCliente {

    REGEX_CORREO("^[^@]+@[^@]+\\.[a-zA-Z]{2,}$"),
    SE_DEBE_INGRESAR_EL_NOMBRE_DEL_AFILIADO("Se debe ingresar el nombre del cliente"),
    SE_DEBE_INGRESAR_EL_TIPO_DE_DOCUMENTO_DEL_AFILIADO("Se debe ingresar el tipo de documento del cliente"),
    SE_DEBE_INGRESAR_EL_NUMERO_DE_DOCUMENTO_DEL_AFILIADO("Se debe ingresar el numero de documento del cliente"),
    SE_DEBE_INGRESAR_EL_EMAIL_DEL_AFILIADO("Se debe ingresar el email del cliente"),
    SE_DEBE_INGRESAR_DIRECCION_DEL_AFILIADO("Se debe ingresar la direccion del cliente"),
    SE_DEBE_INGRESAR_TELEFONO_DEL_AFILIADO("Se debe ingresar el telefono del cliente"),
    SE_DEBE_INGRESAR_LA_FECHA_DE_NACIMIENTO_DEL_AFILIADO("Se debe ingresar la fecha de nacimiento del cliente"),
    SE_DEBE_INGRESAR_LA_FECHA_DE_REGISTRO_DEL_AFILIADO("Se debe ingresar la fecha de registro del cliente"),
    LA_FECHA_DE_NACIMIENTO_NO_PUEDE_SER_MAYOR_A_LA_FECHA_DE_REGISTRO("Fecha de nacimiento no puede ser mayor a la de registro"),
    YA_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_NUMERO_Y_TIPO_DE_DOCUMENTO("Ya existe un cliente con este tipo y numero de documento"),
    NO_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_NUMERO_Y_TIPO_DE_DOCUMENTO("No existe un cliente con este tipo y numero de documento"),
    YA_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID("Ya existe un cliente con este id"),
    NO_EXISTE_UN_AFILIADO_REGISTRADO_CON_ESTE_ID("No existe un cliente con este id");

    private  String mensaje;

    MensajesDeExcepcionCliente(String mensaje){
        this.mensaje=mensaje;
    }
}
