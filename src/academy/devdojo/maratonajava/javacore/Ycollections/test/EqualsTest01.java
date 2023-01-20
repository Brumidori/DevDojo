package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABD1", "Iphone");
        Smartphone s2 = new Smartphone("1ABD1", "Iphone");
        System.out.println(s1.equals(s2)); //false pois 2 obj
        s1 = s2;
        System.out.println(s1.equals(s2));//true pois faz ref ao mesmo obj
    }
}
