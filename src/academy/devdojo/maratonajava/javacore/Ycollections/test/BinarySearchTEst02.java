package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTEst02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Pokemon", 19.9));
        mangas.add(new Manga(1L, "Attack titan", 3.8));
        mangas.add(new Manga(3L, "Dragon Ball", 30.2));
        mangas.add(new Manga(4L, "Haikyu", 29.4));
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaTosearch = new Manga(4L, "Haikyu", 29.4);
        System.out.println(Collections.binarySearch(mangas, mangaTosearch)); //indice 2 apos sort por ID

    }
}
