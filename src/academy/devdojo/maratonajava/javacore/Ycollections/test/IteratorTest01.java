package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Pokemon", 19.9));
        mangas.add(new Manga(1L, "Attack titan", 3.8));
        mangas.add(new Manga(3L, "Dragon Ball", 30.2));
        mangas.add(new Manga(4L, "Haikyu", 29.4));

//       Iterator<Manga> iterator = mangas.iterator();
//       while(iterator.hasNext()){
//           Manga manga = iterator.next();
//           if(iterator.next().getQuantidade() == 0){
//               iterator.remove();
//           }
//       }

       mangas.removeIf(manga -> manga.getQuantidade()==0);
        System.out.println(mangas);

    }
}
