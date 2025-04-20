package com.exemple.escola_projeto.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPai;

    private String nomePai;

    private LocalDate dataNascimentoPai;

    private String enderecoPai;

    private String cepPai;

    private String cpfPai;

    private String rgPai;

    private String profissaoPai;

    private String telefonePai;

    private String emailPai;

    private String localTrabalhoPai;

    private String telefoneTrabalhoPai;

    // Getters and Setters
    public Long getIdPai() {
        return idPai;
    }

    public void setIdPai(Long idPai) {
        this.idPai = idPai;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public LocalDate getDataNascimentoPai() {
        return dataNascimentoPai;
    }

    public void setDataNascimentoPai(LocalDate dataNascimentoPai) {
        this.dataNascimentoPai = dataNascimentoPai;
    }

    public String getEnderecoPai() {
        return enderecoPai;
    }

    public void setEnderecoPai(String enderecoPai) {
        this.enderecoPai = enderecoPai;
    }

    public String getCepPai() {
        return cepPai;
    }

    public void setCepPai(String cepPai) {
        this.cepPai = cepPai;
    }

    public String getCpfPai() {
        return cpfPai;
    }

    public void setCpfPai(String cpfPai) {
        this.cpfPai = cpfPai;
    }

    public String getRgPai() {
        return rgPai;
    }

    public void setRgPai(String rgPai) {
        this.rgPai = rgPai;
    }

    public String getProfissaoPai() {
        return profissaoPai;
    }

    public void setProfissaoPai(String profissaoPai) {
        this.profissaoPai = profissaoPai;
    }

    public String getTelefonePai() {
        return telefonePai;
    }

    public void setTelefonePai(String telefonePai) {
        this.telefonePai = telefonePai;
    }

    public String getEmailPai() {
        return emailPai;
    }

    public void setEmailPai(String emailPai) {
        this.emailPai = emailPai;
    }

    public String getLocalTrabalhoPai() {
        return localTrabalhoPai;
    }

    public void setLocalTrabalhoPai(String localTrabalhoPai) {
        this.localTrabalhoPai = localTrabalhoPai;
    }

    public String getTelefoneTrabalhoPai() {
        return telefoneTrabalhoPai;
    }

    public void setTelefoneTrabalhoPai(String telefoneTrabalhoPai) {
        this.telefoneTrabalhoPai = telefoneTrabalhoPai;
    }
}
