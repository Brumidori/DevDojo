
package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        //strings sao imutaveis
        String nome = " Luffy ";
        System.out.println(nome.charAt(1));//começa no zero
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toUpperCase());

        String numeros = "012345";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(1,4));//segundo parametro nao eh inclusivo
        // no caso vai da posicao [1] a [3]
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim());//remove espaços em branco no começo e no final

    }
}
