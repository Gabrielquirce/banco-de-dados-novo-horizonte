package com.exemple.escola_projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "observacoes")
public class Observacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObservacoes;

    private String temIrmao;

    private String temAcompanhamento;

    private String temAlergia;

    private String temMedicamento;

    private String pessoasAutorizadas;

    // Getters and Setters
    public Long getIdObservacoes() {
        return idObservacoes;
    }

    public void setIdObservacoes(Long idObservacoes) {
        this.idObservacoes = idObservacoes;
    }

    public String getTemIrmao() {
        return temIrmao;
    }

    public void setTemIrmao(String temIrmao) {
        this.temIrmao = temIrmao;
    }

    public String getTemAcompanhamento() {
        return temAcompanhamento;
    }

    public void setTemAcompanhamento(String temAcompanhamento) {
        this.temAcompanhamento = temAcompanhamento;
    }

    public String getTemAlergia() {
        return temAlergia;
    }

    public void setTemAlergia(String temAlergia) {
        this.temAlergia = temAlergia;
    }

    public String getTemMedicamento() {
        return temMedicamento;
    }

    public void setTemMedicamento(String temMedicamento) {
        this.temMedicamento = temMedicamento;
    }

    public String getPessoasAutorizadas() {
        return pessoasAutorizadas;
    }

    public void setPessoasAutorizadas(String pessoasAutorizadas) {
        this.pessoasAutorizadas = pessoasAutorizadas;
    }
}
