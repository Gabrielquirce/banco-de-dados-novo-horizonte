package com.exemple.escola_projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "observacoes")
public class Observacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObservacoes;

    @NotBlank(message = "O campo 'tem irmão' é obrigatório")
    private String temIrmao;

    @NotBlank(message = "O campo 'tem acompanhamento' é obrigatório")
    private String temAcompanhamento;

    @NotBlank(message = "O campo 'tem alergia' é obrigatório")
    private String temAlergia;

    @NotBlank(message = "O campo 'tem medicamento' é obrigatório")
    private String temMedicamento;

    @NotBlank(message = "O campo 'pessoas autorizadas' é obrigatório")
    private String pessoasAutorizadas;

    @NotBlank(message = "O campo 'responsável financeiro' é obrigatório")
    private String responsavelFinancereiro;

    @NotBlank(message = "O telefone do responsável financeiro é obrigatório")
    @Pattern(regexp = "^\\(\\d{2}\\) \\d{4}-\\d{4}$", message = "Telefone do responsável financeiro deve estar no formato (00) 0000-0000")
    private String telefoneResponsavelFinancereiro;

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

    public String getTelefoneResponsavelFinancereiro() {
        return telefoneResponsavelFinancereiro;
    }

    public void setTelefoneResponsavelFinancereiro(String telefoneResponsavelFinancereiro) {
        this.telefoneResponsavelFinancereiro = telefoneResponsavelFinancereiro;
    }

    public String getResponsavelFinancereiro() {
        return responsavelFinancereiro;
    }

    public void setResponsavelFinancereiro(String responsavelFinancereiro) {
        this.responsavelFinancereiro = responsavelFinancereiro;
    }
}
