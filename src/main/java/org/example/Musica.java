package org.example;

public class Musica extends ItemPlaylist {
    private String artista;

    public Musica(String nome, String artista) {
        super(nome);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getItemPlaylist() {
        return "Música: " + this.getNome() + " - artista: " + this.artista + "\n";
    }
}
