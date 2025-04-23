package com.exemple.escola_projeto.dto;

public class MaeDto {

    private Long idMae;

    private String nomeMae;

    private String enderecoMae;

    private String cpfMae;

    private String rgMae;

    private String telefoneMae;

    private String emailMae;

    private String localTrabalhoMae;

    private String telefoneTrabalhoMae;

    public MaeDto(Long idMae, String nomeMae, String enderecoMae, String cpfMae, String rgMae,
            String telefoneMae, String emailMae, String localTrabalhoMae, String telefoneTrabalhoMae) {
        this.idMae = idMae;
        this.nomeMae = nomeMae;
        this.enderecoMae = enderecoMae;
        this.cpfMae = cpfMae;
        this.rgMae = rgMae;
        this.telefoneMae = telefoneMae;
        this.emailMae = emailMae;
        this.localTrabalhoMae = localTrabalhoMae;
        this.telefoneTrabalhoMae = telefoneTrabalhoMae;
    }

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

    public String getEnderecoMae() {
        return enderecoMae;
    }

    public void setEnderecoMae(String enderecoMae) {
        this.enderecoMae = enderecoMae;
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
