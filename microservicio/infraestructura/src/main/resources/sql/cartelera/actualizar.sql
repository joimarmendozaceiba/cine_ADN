update cartelera
set nombre_mes = :nombreMes,
    id_pelicula = :idPelicula,
    fecha_inicio = :fechaInicio,
    fecha_fin = :fechaFin,
where id = :id;