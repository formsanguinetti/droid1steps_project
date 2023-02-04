package com.example.jogadores.seleccao.model;

public class Jogador {
    String nome;
    int picture;

    public Jogador(String nome, int picture) {
        this.nome = nome;
        this.picture = picture;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
