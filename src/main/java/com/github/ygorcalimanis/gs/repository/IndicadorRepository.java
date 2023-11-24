package com.github.ygorcalimanis.gs.repository;

import com.github.ygorcalimanis.gs.model.Indicador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, String> {
    @Query("select o from Indicador o where o.objetivo.id = :id")
    List<Indicador> findByObjetivo(@Param("id") String id);
}