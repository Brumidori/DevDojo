package academy.devdojo.maratonajava.javacore.Binstroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Binstroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");

        calculadora.subtraiDoisNumeros();

        calculadora.multiplicaDoisNumeros(3, 7);
    }
}
