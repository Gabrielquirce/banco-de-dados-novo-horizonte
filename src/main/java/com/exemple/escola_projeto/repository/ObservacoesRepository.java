package com.exemple.escola_projeto.repository;

import com.exemple.escola_projeto.model.Observacoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ObservacoesRepository extends JpaRepository<Observacoes, Long> {
}
