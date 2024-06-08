package com.aluracursos.screenmatch.dto;

import com.aluracursos.screenmatch.model.Categoria;


public record SerieDTO(
        Long id,
        String titulo,
        Integer totalTemporadas,
        Double evaluacion,
        String poster,
        Categoria genero,
        String actores,
        String sinopsis) {
}
