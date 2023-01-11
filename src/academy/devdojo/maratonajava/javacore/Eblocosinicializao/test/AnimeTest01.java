package academy.devdojo.maratonajava.javacore.Eblocosinicializao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializao.dominio.Anime;
import org.w3c.dom.ls.LSOutput;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
        Anime anime2 = new Anime("GD");
        System.out.println(anime2.getEpisodios());
    }
}
