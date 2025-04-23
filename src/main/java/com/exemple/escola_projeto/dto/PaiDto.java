package com.exemple.escola_projeto.dto;

public class PaiDto {

    private Long idPai;

    private String nomePai;

    private String enderecoPai;

    private String cpfPai;

    private String rgPai;

    private String telefonePai;

    private String emailPai;

    private String localTrabalhoPai;

    private String telefoneTrabalhoPai;

    public PaiDto(Long idPai, String nomePai, String enderecoPai, String cpfPai, String rgPai, String telefonePai,
            String emailPai, String localTrabalhoPai, String telefoneTrabalhoPai) {
        this.idPai = idPai;
        this.nomePai = nomePai;
        this.enderecoPai = enderecoPai;
        this.cpfPai = cpfPai;
        this.rgPai = rgPai;
        this.telefonePai = telefonePai;
        this.emailPai = emailPai;
        this.localTrabalhoPai = localTrabalhoPai;
        this.telefoneTrabalhoPai = telefoneTrabalhoPai;
    }

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

    public String getEnderecoPai() {
        return enderecoPai;
    }

    public void setEnderecoPai(String enderecoPai) {
        this.enderecoPai = enderecoPai;
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
