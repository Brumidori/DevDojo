package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUNC", 11000);
        Tomate tomate = new Tomate("Tomate italiano", 10);
        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImpostoComputador(computador);
    }
}
