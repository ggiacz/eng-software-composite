package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends ItemPlaylist {
    private List<ItemPlaylist> itens;

    public Playlist(String nome) {
        super(nome);
        this.itens = new ArrayList<ItemPlaylist>();
    }

    public void addItemPlaylist(ItemPlaylist item) {
        this.itens.add(item);
    }

    public String getItemPlaylist() {
        String saida = "";
        saida = "Playlist: " + this.getNome() + "\n";
        for (ItemPlaylist item : itens) {
            saida += item.getItemPlaylist();
        }
        return saida;
    }
}
