package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABD1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Moto");
        Smartphone s3 = new Smartphone("3333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "Moto");
        System.out.println(smartphones.contains(s4));
        int indexs4 = smartphones.indexOf(s4);
        System.out.println(indexs4); //imprime 1 - onde encontra a primeira vez o obj
        //se nao existe retorna -1

        smartphones.add(0,s4);
        indexs4 = smartphones.indexOf(s4);
        System.out.println(indexs4); //imprime 0 - eh possivel escolher o indice ao add objetos no ArrayList



    }
}
