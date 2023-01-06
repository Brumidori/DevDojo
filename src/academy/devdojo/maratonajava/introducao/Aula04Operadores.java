package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01/(double)numero02; //precisa fazer cast em pelo menos um valor

        System.out.println("Valor" + numero02 + numero01);
        System.out.println(numero02 + numero01 + "Valor" + numero02 + numero01);//cuidado com a String
        System.out.println(resultado);
    }
}
