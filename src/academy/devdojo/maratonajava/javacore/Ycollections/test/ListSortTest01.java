package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Pokemon");
        mangas.add("Attack titan");
        mangas.add("Dragon Ball");
        mangas.add("Haikyu");
        //ordenar por ordem alfabetica
        Collections.sort(mangas);
        for (String manga: mangas
             ) {
            System.out.println(manga);
        }
    }
}
