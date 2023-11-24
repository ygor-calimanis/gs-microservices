package com.github.ygorcalimanis.gs.service;

import com.github.ygorcalimanis.gs.model.Objetivo;
import com.github.ygorcalimanis.gs.repository.ObjetivoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ObjetivoService {
    private final ObjetivoRepository objetivoRepository;
    public List<Objetivo> getAll() {
        return objetivoRepository.findAll();

    }
    public boolean exists(String id) {
        return objetivoRepository.existsById(id);

    }
    public Objetivo findById(String id) {
        return objetivoRepository.findById(id).orElse(null);

    }
    public Objetivo save(Objetivo objetivo) {
        return objetivoRepository.save(objetivo);

    }

}