package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador " + computador.getNome() +
                " Valor do computador: "+ computador.getValor() +
                ". Imposto a ser pago " +
                imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println(
                " Valor do tomate: "+ tomate.getValor() +
                ". Imposto a ser pago " + imposto);
    }

    public static void calcularImpostoComputador(Produto produto){
        System.out.println("Relatorio de imposto ");
        double imposto = produto.calcularImposto();
        System.out.println("Imposto do produto " + produto.getNome() +
                " Valor do produto: "+ produto.getValor() +
                ". Imposto a ser pago " +
                imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }

}
