package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTEst01 {
    public static void main(String[] args) {
        List <Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(0);

        //(-(pontos de insercao) -1)

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 2));
        System.out.println(Collections.binarySearch(numeros, 7));//-6 pq nao existe
    }
}
