package com.github.ygorcalimanis.gs.controller;

import com.github.ygorcalimanis.gs.model.Objetivo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ObjetivoMapper {
    private final ModelMapper modelMapper;

    public ObjetivoDTO map(Objetivo objetivo) {
        ObjetivoDTO dto = modelMapper.map(objetivo, ObjetivoDTO.class);
        return dto;
    }
}
