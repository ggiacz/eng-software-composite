package org.example;

public abstract class ItemPlaylist {
    private String nome;

    public ItemPlaylist(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getItemPlaylist();
}
