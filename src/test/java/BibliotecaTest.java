import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void deveRetornarEstruturaBiblioteca() {
        Playlist playlist1 = new Playlist("Favoritas");

        Playlist playlist2 = new Playlist("Rock Nacional");
        Musica musica21 = new Musica("Anna Júlia", "Los Hermanos");
        playlist2.addItemPlaylist(musica21);

        Playlist playlist3 = new Playlist("Indie Nacional");
        Musica musica31 = new Musica("Yoko", "Terno Rei");
        Musica musica32 = new Musica("Missão Apollo", "Zimbra");
        playlist3.addItemPlaylist(musica31);
        playlist3.addItemPlaylist(musica32);

        Playlist principal = new Playlist("Minhas Músicas");
        principal.addItemPlaylist(playlist1);
        principal.addItemPlaylist(playlist2);
        principal.addItemPlaylist(playlist3);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setItemBiblioteca(principal);

        assertEquals("Playlist: Minhas Músicas\n" +
                "Playlist: Favoritas\n" +
                "Playlist: Rock Nacional\n" +
                "Música: Anna Júlia - artista: Los Hermanos\n" +
                "Playlist: Indie Nacional\n" +
                "Música: Yoko - artista: Terno Rei\n" +
                "Música: Missão Apollo - artista: Zimbra\n", biblioteca.getItemBiblioteca());
    }

    @Test
    void deveRetornarExcecaoBibliotecaSemItens() {
        try {
            Biblioteca biblioteca = new Biblioteca();
            biblioteca.getItemBiblioteca();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Biblioteca sem itens", e.getMessage());
        }
    }
}
