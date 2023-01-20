package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("HB", 2000);
        Produto produto1 = new Tomate("americano", 14);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.getNome());
        System.out.println(produto.calcularImposto());

        System.out.println("----------------------");
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        //nao posso acessar data de validade, pq nao existe em produto
    }
}
