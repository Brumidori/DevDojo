package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        //set nao permite elementos duplicados dentro da coleção
        //set tbm eh interface que extends Collections
        Set<Manga>  mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Pokemon", 19.9));
        mangas.add(new Manga(1L, "Attack titan", 3.8));
        mangas.add(new Manga(3L, "Dragon Ball", 30.2));
        mangas.add(new Manga(4L, "Haikyu", 29.4));
        mangas.add(new Manga(4L, "Haikyu", 29.4));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
