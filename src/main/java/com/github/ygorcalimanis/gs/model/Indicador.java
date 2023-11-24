package com.github.ygorcalimanis.gs.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Indicador {
    @Id
    private String id;

    @ManyToOne(optional = false)
    private Objetivo objetivo;

    @Column(nullable = false, length = 100)
    private String desc;
}