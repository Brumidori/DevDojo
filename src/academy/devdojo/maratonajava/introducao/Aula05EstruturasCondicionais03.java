package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
        String resultado;

        if(salario > 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        //operador ternario
        double salario2 = 3000;
        String resultado2 = salario2 > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado2);
    }
}
