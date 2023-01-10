package academy.devdojo.maratonajava.javacore.Binstroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Binstroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(1,2);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);
    }
}
