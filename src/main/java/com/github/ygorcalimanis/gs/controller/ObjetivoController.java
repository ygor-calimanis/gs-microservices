package com.github.ygorcalimanis.gs.controller;

import com.github.ygorcalimanis.gs.model.Objetivo;
import com.github.ygorcalimanis.gs.repository.ObjetivoRepository;
import com.github.ygorcalimanis.gs.service.IndicadorService;
import com.github.ygorcalimanis.gs.service.ObjetivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/objetivos")
@RequiredArgsConstructor
public class ObjetivoController {
    private final ObjetivoService objetivoService;
    private final ObjetivoRepository objetivoRepository;
    private final ObjetivoMapper objetivoMapper;
    private final IndicadorService indicadorService;
    private final IndicadorMapper indicadorMapper;
    @GetMapping
    public ResponseEntity<List<ObjetivoDTO>> getAll() {
        List<ObjetivoDTO> result = objetivoService.getAll().stream().map(objetivoMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("{id}/indicadores")
    public ResponseEntity<List<IndicadorDTO>> findIndicadoresByObjetivoId(@PathVariable String id) {
        if (!objetivoService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        List<IndicadorDTO> dto = indicadorService.findByObjetivo(id).stream().map(indicadorMapper::map)
                .collect(Collectors.toList());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
