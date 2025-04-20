package com.exemple.escola_projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.escola_projeto.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
