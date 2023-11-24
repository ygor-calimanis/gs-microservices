package com.github.ygorcalimanis.gs.controller;

import com.github.ygorcalimanis.gs.model.Indicador;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IndicadorMapper {
    private final ModelMapper modelMapper;
    public IndicadorDTO map(Indicador indicador) {
        IndicadorDTO dto = modelMapper.map(indicador, IndicadorDTO.class);
        return dto;
    }
}
