package org.example;

public class Biblioteca {
    private ItemPlaylist itemBiblioteca;

    public void setItemBiblioteca(ItemPlaylist itemBiblioteca) {
        this.itemBiblioteca = itemBiblioteca;
    }

    public String getItemBiblioteca() {
        if (this.itemBiblioteca == null) {
            throw new NullPointerException("Biblioteca sem itens");
        }
        return this.itemBiblioteca.getItemPlaylist();
    }
}
