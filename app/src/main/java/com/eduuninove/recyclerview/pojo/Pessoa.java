package com.eduuninove.recyclerview.pojo;

public class Pessoa {

    private String nome;
    private String profissao;
    private int adade;

    public Pessoa(String nome, String profissao, int adade) {
        this.nome = nome;
        this.profissao = profissao;
        this.adade = adade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getAdade() {
        return adade;
    }

    public void setAdade(int adade) {
        this.adade = adade;
    }
}
