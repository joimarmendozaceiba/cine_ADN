create table cliente (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
  tipoDocumento VARCHAR(2) NOT NULL,
  numeroDocumento VARCHAR(45) NOT NULL,
  fechaNacimiento DATETIME NOT NULL,
  email VARCHAR(100) NOT NULL,
  direccion VARCHAR(100) NULL,
  telefono BIGINT NULL,
  fechaRegistro DATETIME NOT NULL,
  banco VARCHAR(50),
  cuenta_bancaria BIGINT NOT NULL,
 primary key (id)
);

create table boleto (
 id int(11) not null auto_increment,
 nombre_pelicula varchar(100) not null,
 fecha_funcion DATETIME not null,
 valor DECIMAL(10,2) not null,
 pago_banco VARCHAR (50) not null,
 sede_id int(11) not null,
 primary key (id)
);

create table cartelera (
id int (11) not null auto_increment,
nombre_mes varchar (100) not null,
id_pelicula int(11) not null,
fecha_inicio DATETIME not null,
fecha_fin DATETIME not null,
primary key (id)
);

create table sede(
id int (11) not null auto_increment,
nombre_sede varchar (100) not null,
fecha_apertura DATETIME not null,
primary key (id)
);

create table pelicula (
 id int(11) not null auto_increment,
 nombre_pelicula varchar(100) not null,
 genero varchar(50) not null,
 duracion int(11) not null,
 descripcion VARCHAR (200) not null,
 año int(11) not null,
 director varchar(50),
 primary key (id)
);




