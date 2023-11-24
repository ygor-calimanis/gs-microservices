package com.github.ygorcalimanis.gs.repository;

import com.github.ygorcalimanis.gs.model.Objetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, String> {
}
