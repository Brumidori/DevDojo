package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(2, 0));

        //linha nao eh executada pq a linha 5 nao esta sendo tratada
        System.out.println("condigo encerrado");
    }

    private static int divisao(int a, int b){
        //runtime nao precisa de declaracao na assinatura do metodo
        if(b==0){
            throw new IllegalArgumentException("argumento ilegal, nao pode ser zero");
        }

            return a/b;

    }
}
