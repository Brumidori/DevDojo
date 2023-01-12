package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        anime2.setNome("Haki");
        System.out.println(anime2.getNome());
        Anime anime3 = new Anime();

    }
}
