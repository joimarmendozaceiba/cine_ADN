update pelicula
set nombre = :nombre,
    genero = :genero,
    duracion = :duracion,
    descripcion = :descripcion,
    año = :año,
    director = :director
where id = :id;