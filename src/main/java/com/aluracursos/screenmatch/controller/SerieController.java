package com.aluracursos.screenmatch.controller;

import com.aluracursos.screenmatch.dto.EpisodioDTO;
import com.aluracursos.screenmatch.dto.SerieDTO;
import com.aluracursos.screenmatch.model.Categoria;
import com.aluracursos.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")

public class SerieController {
    @Autowired
    private SerieService serieService;

    @GetMapping()
    public List<SerieDTO> obtenerSeries() {
        return serieService.obtenerSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obtenerTop5Series() {
        return serieService.obtenerTop5();
    }

    @GetMapping("/lanzamientos")
    public List<SerieDTO> obtenerLanzamientos() {
        return serieService.obtenerLanzamientosMasRecientes();
    }

    @GetMapping("/{id}")
    public SerieDTO obtenerPorId(@PathVariable Long id) {
        return serieService.obtenerPorId(id);
    }

    @GetMapping("/{id}/temporadas/todas")
    public List<EpisodioDTO> obtenerTemporadas(@PathVariable Long id) {
        return serieService.obtenerTemporadas(id);
    }

    @GetMapping("/{id}/temporadas/{numeroTemporada}")
    public List<EpisodioDTO> obtenerTemporadasPorNumero(@PathVariable Long id,
                                                        @PathVariable Long numeroTemporada) {
        return serieService.obtenerTemporadasPorNumero(id, numeroTemporada);
    }

    @GetMapping("/categoria/{genero}")
    public List<SerieDTO> obtenerSeriesPorCategoria(@PathVariable String genero){
        return serieService.obtenerSeriesPorCategoria(genero);
    }

    @GetMapping("/{id}/temporadas/top")
    public List<EpisodioDTO> obtenerTop5Episodios(@PathVariable Long id){
        return serieService.obtenerTop5Episodios(id);
    }
}
