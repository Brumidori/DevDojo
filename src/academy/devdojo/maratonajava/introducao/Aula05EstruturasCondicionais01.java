package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {
        int idade =25;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(idade >= 18){
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }

        int idade2 = 15;
        boolean isAutorizadoComprarBebida2 = idade2 >= 18;
        if(isAutorizadoComprarBebida2){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }

        if (!isAutorizadoComprarBebida2){
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }

        boolean c = true;
        if (c == false){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("fora do if");
    }
}
