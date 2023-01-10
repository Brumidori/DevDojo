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
}
