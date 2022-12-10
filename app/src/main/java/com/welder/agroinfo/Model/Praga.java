package com.welder.agroinfo.Model;

public class Praga {

    private  int foto;
    private String nome;
    private String resumo;


    public Praga(int foto, String nome, String resumo) {
        this.foto = foto;
        this.nome = nome;
        this.resumo = resumo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
