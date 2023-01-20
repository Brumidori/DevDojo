package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MagaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Pokemon", 19.9));
        mangas.add(new Manga(1L, "Attack titan", 3.8));
        mangas.add(new Manga(3L, "Dragon Ball", 30.2));
        mangas.add(new Manga(4L, "Haikyu", 29.4));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
