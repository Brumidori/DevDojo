package academy.devdojo.maratonajava.javacore.Binstroducaometodos.dominio;

public class Calculadora {
    //modificador de acesso (public), retorno (void = vazio), nome metodo
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int a, float b){
        System.out.println(a*b);
    }

    public double divideDoisNumeros(int num1, double num2){
        if (num2 ==0){
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisNumeros2(int num1, double num2){
        if (num2 ==0){
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public double divideDoisNumeros3(int num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Não existe divisao po zero");
            return;
        }
            System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //mesmo metodo outra sintaxa - args tem que ser o ultimo atributo
    //poderia (double num1, int... numeros)
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
