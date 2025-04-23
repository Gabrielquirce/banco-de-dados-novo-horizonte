package com.exemple.escola_projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.escola_projeto.model.Pai;

public interface PaiRepository extends JpaRepository<Pai, Long> {
}
