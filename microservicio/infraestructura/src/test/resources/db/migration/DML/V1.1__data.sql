insert into pelicula(id, nombre_pelicula,genero,duracion,descripcion,año,director)
values(1,'la pelicula fea','accion',120,'descripcion de pelicula',2020,'Juan caselles');

insert into cliente(id,nombre,tipoDocumento,numeroDocumento,fechaNacimiento, email, direccion, telefono,fechaRegistro, banco,cuenta_bancaria)
values(1,'Ortencio','cc','12345678',now(),'email@gmail.com','direccion calle','12367212', now(),'banco amigo', 1234123);

insert into boleto(nombre_pelicula,fecha_funcion,valor,pago_banco,sede_id)
values('la pelicula fea',now(),7000.00,'banco amigo',1);

insert into cartelera(id,nombre_mes,id_pelicula,fecha_inicio,fecha_fin)
values(1,'Junio',2,now(),now());