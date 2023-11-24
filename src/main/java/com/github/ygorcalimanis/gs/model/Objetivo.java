package com.github.ygorcalimanis.gs.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Objetivo {
    @Id
    private String id;
}
