package academy.devdojo.maratonajava.introducao;

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Bruna";
        String endereco = "Capgemini";
        double salario = 10000.12;
        String dataRecebimentoSalario = "20/01/2023";
        String relatorio = "Eu " + nome + ", morando no endereco " + endereco
                + ", confirmo que recebi o salario de "
                + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
