package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        nomes.add("Bruna");
        nomes.add("DevDojo");

        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("-----------");
        nomes.add("Midori");
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        nomes.remove("Midori"); //pode pegar indice ou objeto

        List <String> nomes2 = new ArrayList<>();
        nomes2.add("ya");
        nomes2.add("yo");
        nomes.addAll(nomes2);

    }
}
