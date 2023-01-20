package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        //strings sao imutaveis
        String nome = "bruna"; // dentro do pool de constantes
        String nome2 = "bruna";
        System.out.println(nome == nome2); //true - faz referencia ao mesmo objeto

        nome.concat("Midori");
        System.out.println(nome == nome2); //true - nome ainda faz referencia a bruna
        System.out.println(nome); // nao existe ref para bruna Midori

        nome = nome.concat(" Midori");
        System.out.println(nome == nome2); //false - agora nome faz ref a bruna Midori
        System.out.println(nome);

        String nome3 = new String("bruna"); //criando variavel de ref - criando objto do tipo String - uma String no pool String
        System.out.println(nome2 == nome3); //false - pois nome3 eh um objeto q encapsula String bruna
        System.out.println(nome2 == nome3.intern()); // true - valor das Strings eh o mesmo
    }
}
