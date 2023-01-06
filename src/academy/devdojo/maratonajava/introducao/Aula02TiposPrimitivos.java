package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        // tipo nomeVar = valor;
        int age = 10;
        int cast = (int) 10000000000L; //força caber dentro do tipo, mas corta para caber
        long numeroGrande =100000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87; //tabela ascII
        char caractere1 = '\u0841'; //tabela unicode

        String string = "um grande texto";

        System.out.println("a idade e: " + age + " anos.");
        System.out.println(falso);
        System.out.println("char: " + caractere);
        System.out.println(cast);
        System.out.println(string);
    }
}