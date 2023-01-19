package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
       try{
           System.out.println("Abrindo arquivo");
           System.out.println("Escrendo dados no arquivi");
           throw new RuntimeException();
          // System.out.println("Fechando recurso liberado");
       } catch (Exception e){
           e.printStackTrace();
       } finally {
           //pode colocar soh try - finally
           System.out.println("Fechando recurso");
       }
    }

    private static int divisao(int a, int b){
        //runtime nao precisa de declaracao na assinatura do metodo
        if(b==0){
            throw new IllegalArgumentException("argumento ilegal, nao pode ser zero");
        }

            return a/b;

    }
}
