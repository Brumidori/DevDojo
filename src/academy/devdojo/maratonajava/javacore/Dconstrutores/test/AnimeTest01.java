package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Hiakyu", "TV", 12);
        anime.imprime();
        Anime anime2 = new Anime("Bleach", "TV", 200, "Acao");
        anime2.imprime();
    }
}
