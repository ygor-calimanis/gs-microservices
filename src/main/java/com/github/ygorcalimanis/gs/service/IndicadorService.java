package com.github.ygorcalimanis.gs.service;

import com.github.ygorcalimanis.gs.model.Indicador;
import com.github.ygorcalimanis.gs.repository.IndicadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndicadorService {
    private final IndicadorRepository indicadorRepository;
    public List<Indicador> getAll() {
        return indicadorRepository.findAll();
    }
    public List<Indicador> findByObjetivo(String id) {
        return indicadorRepository.findByObjetivo(id);
    }
}