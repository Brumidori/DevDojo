package academy.devdojo.maratonajava.javacore.Lclassesabastratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabastratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabastratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabastratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Zoro", 20000);
        Gerente gerente = new Gerente("Nami", 50000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 40000);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();

    }
}
