package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count <= 10){
            System.out.println(count);
            count++; //condicao de parada - se nao infinito
        }
        count = 8;
        do {
            System.out.println("dentro do do-while" + ++count);
        } while (count < 10);

        for (count =0; count <=10; count ++) {
            System.out.println("for " + count);
        }
    }
}
