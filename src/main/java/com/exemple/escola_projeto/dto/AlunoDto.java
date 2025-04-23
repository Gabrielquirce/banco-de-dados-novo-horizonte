package com.exemple.escola_projeto.dto;

public class AlunoDto {

    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String turno;
    private String tipoSanguineo;
    private String resideCom;

    public AlunoDto(Long id, String nome, String cpf, String rg, String turno, String tipoSanguineo, String resideCom) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.turno = turno;
        this.tipoSanguineo = tipoSanguineo;
        this.resideCom = resideCom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getResideCom() {
        return resideCom;
    }

    public void setResideCom(String resideCom) {
        this.resideCom = resideCom;
    }

}
