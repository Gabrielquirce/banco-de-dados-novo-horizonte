package com.exemple.escola_projeto.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "maes")
public class Mae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMae;

    private String nomeMae;

    private LocalDate dataNascimentoMae;

    private String enderecoMae;

    private String cepMae;

    private String cpfMae;

    private String rgMae;

    private String profissaoMae;

    private String telefoneMae;

    private String emailMae;

    private String localTrabalhoMae;

    private String telefoneTrabalhoMae;

    public Long getIdMae() {
        return idMae;
    }

    public void setIdMae(Long idMae) {
        this.idMae = idMae;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public LocalDate getDataNascimentoMae() {
        return dataNascimentoMae;
    }

    public void setDataNascimentoMae(LocalDate dataNascimentoMae) {
        this.dataNascimentoMae = dataNascimentoMae;
    }

    public String getEnderecoMae() {
        return enderecoMae;
    }

    public void setEnderecoMae(String enderecoMae) {
        this.enderecoMae = enderecoMae;
    }

    public String getCepMae() {
        return cepMae;
    }

    public void setCepMae(String cepMae) {
        this.cepMae = cepMae;
    }

    public String getCpfMae() {
        return cpfMae;
    }

    public void setCpfMae(String cpfMae) {
        this.cpfMae = cpfMae;
    }

    public String getRgMae() {
        return rgMae;
    }

    public void setRgMae(String rgMae) {
        this.rgMae = rgMae;
    }

    public String getProfissaoMae() {
        return profissaoMae;
    }

    public void setProfissaoMae(String profissaoMae) {
        this.profissaoMae = profissaoMae;
    }

    public String getTelefoneMae() {
        return telefoneMae;
    }

    public void setTelefoneMae(String telefoneMae) {
        this.telefoneMae = telefoneMae;
    }

    public String getEmailMae() {
        return emailMae;
    }

    public void setEmailMae(String emailMae) {
        this.emailMae = emailMae;
    }

    public String getLocalTrabalhoMae() {
        return localTrabalhoMae;
    }

    public void setLocalTrabalhoMae(String localTrabalhoMae) {
        this.localTrabalhoMae = localTrabalhoMae;
    }

    public String getTelefoneTrabalhoMae() {
        return telefoneTrabalhoMae;
    }

    public void setTelefoneTrabalhoMae(String telefoneTrabalhoMae) {
        this.telefoneTrabalhoMae = telefoneTrabalhoMae;
    }
}
