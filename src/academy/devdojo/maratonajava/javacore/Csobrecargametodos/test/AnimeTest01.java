package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akuma", "TV", 12);
        Anime anime2 = new Anime("Akuma2", "Pc", 12, "Açao");
        anime.imprime();
    }
}
