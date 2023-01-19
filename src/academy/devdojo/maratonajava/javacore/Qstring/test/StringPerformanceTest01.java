
package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim -inicio) + " ms");

         inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim -inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim -inicio) + " ms");
    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++){
            texto +=i;
        }
    }


    //string builder diminui o tempo de execucao
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }

    //string buffer diminui o tempo de execucao - synchronize
    private static void concatStringBuffer(int tamanho){
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++){
            sbf.append(i);
        }
    }
}
