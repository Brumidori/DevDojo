package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("HB", 2000);
        Tomate produto1 = new Tomate("americano", 14);

        produto1.setDataValidade("11/11/2023");
        CalculadoraImposto.calcularImpostoComputador(produto1);
        CalculadoraImposto.calcularImpostoComputador(produto);
    }
}
