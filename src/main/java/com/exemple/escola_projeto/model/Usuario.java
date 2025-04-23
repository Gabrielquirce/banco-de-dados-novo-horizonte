package com.exemple.escola_projeto.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String role; // "PAI" ou "DIRETOR"

    private String nome;

    @OneToMany
    private List<Aluno> alunos; // Se for um pai
    public Usuario(List<Aluno> alunos, String email, Long id, String nome, String role, String senha) {
        this.alunos = alunos;
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.role = role;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }
}