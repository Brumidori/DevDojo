package academy.devdojo.maratonajava.javacore.Binstroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Binstroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987.20, 2000};

        funcionario.imprime();

    }
}
