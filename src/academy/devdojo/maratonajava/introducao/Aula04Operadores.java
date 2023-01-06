package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01/(double)numero02; //precisa fazer cast em pelo menos um valor

        System.out.println("Valor" + numero02 + numero01);
        System.out.println(numero02 + numero01 + "Valor" + numero02 + numero01);//cuidado com a String
        System.out.println(resultado);

        int resto = 20%2;
        System.out.println(resto);

        //operadores logicos retornam valores booleanos
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteQueVinte);

        // && (and) || (OR)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlayStation5Compravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStation5Compravel " + isPlayStation5Compravel);

        //operadores de atribuicao = += -= /= %=
        double bonus = 1000;
        bonus += 2000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /=2;
        System.out.println(bonus);
        bonus %=2;
        System.out.println(bonus);

        int contador = 0;
        contador+=1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++); //resultado final 2, mas nao mostra pois ++ no final primeiro imprimi depois soma
        System.out.println(++contador); // resultado 2, soma e imprimi

    }
}
