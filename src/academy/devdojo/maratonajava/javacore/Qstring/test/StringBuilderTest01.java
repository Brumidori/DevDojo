package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Bruna Midori";
        nome.concat(" DevDojo");
        System.out.println(nome);
        System.out.println(nome.substring(0,3));
        //string builder nao eh string - ou seja, eh mutavel
        StringBuilder sb = new StringBuilder("Bruna Midori");
        sb.append(" DevDojo");
        //consegue imprimir pq tem metodo toString() na classe
        System.out.println(sb);
        System.out.println(sb.substring(0,2));
        //metodo substring retorna String - entao nao altera a substring em si
        System.out.println(sb);
        sb.delete(0,2); //retorna stringBuilder - altera
        System.out.println(sb);
    }
}
