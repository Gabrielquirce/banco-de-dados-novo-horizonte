package com.exemple.escola_projeto.dto;

public class ObservacoesDto {

    private String temAcompanhamento;
    private String temAlergia;
    private String temMedicamento;
    private String pessoasAutorizadas;
    private String responsavelFinancereiro;
    private String telefoneResponsavelFinancereiro;

    public ObservacoesDto(String temAcompanhamento, String temAlergia, String temMedicamento, String pessoasAutorizadas,
            String responsavelFinancereiro, String telefoneResponsavelFinancereiro) {
        this.temAcompanhamento = temAcompanhamento;
        this.temAlergia = temAlergia;
        this.temMedicamento = temMedicamento;
        this.pessoasAutorizadas = pessoasAutorizadas;
        this.responsavelFinancereiro = responsavelFinancereiro;
        this.telefoneResponsavelFinancereiro = telefoneResponsavelFinancereiro;
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

    public String getResponsavelFinancereiro() {
        return responsavelFinancereiro;
    }

    public void setResponsavelFinancereiro(String responsavelFinancereiro) {
        this.responsavelFinancereiro = responsavelFinancereiro;
    }

    public String getTelefoneResponsavelFinancereiro() {
        return telefoneResponsavelFinancereiro;
    }

    public void setTelefoneResponsavelFinancereiro(String telefoneResponsavelFinancereiro) {
        this.telefoneResponsavelFinancereiro = telefoneResponsavelFinancereiro;
    }
}
