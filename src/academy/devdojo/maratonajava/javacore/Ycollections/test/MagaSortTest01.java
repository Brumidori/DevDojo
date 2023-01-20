package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MagaSortTest01 {

    class MangaByIdComparator implements Comparator<Manga>{

        @Override
        public int compare(Manga o1, Manga o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }

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
        Collections.sort(mangas, new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
