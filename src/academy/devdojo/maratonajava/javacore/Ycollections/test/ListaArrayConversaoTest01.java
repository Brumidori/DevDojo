package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] arraysToList = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arraysToList));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0]=1;
        numerosArray[1]=2;
        numerosArray[2]=3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        //cuidado com asList, pois imutavel e mantem link com o original
    }
}
