package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado o valor de um carro descubra quantas vezes ele pode ser parcelado
    //condicao e que o valor da parcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000.37;
        double valorParcela;
        int qtdParcelas;

        for (qtdParcelas = 1 ; qtdParcelas <= valorCarro ; qtdParcelas ++) {
            valorParcela = valorCarro / qtdParcelas;
            if (valorParcela >= 1000){
                System.out.println("Quantidade de parcelas: " + qtdParcelas + " R$ " + valorParcela);
            } else {
                break;
            }
            System.out.println("Fora do if, mas dentro do for "  + qtdParcelas);
        }

        //forma reduzida
        for (qtdParcelas = 1 ; qtdParcelas <= valorCarro ; qtdParcelas ++) {
            valorParcela = valorCarro / qtdParcelas;
            if (valorParcela < 1000){
               break;
            } else {
                System.out.println("Quantidade de parcelas: " + qtdParcelas + " R$ " + valorParcela);
            }
            System.out.println("Fora do if, mas dentro do for "  + qtdParcelas);
        }
    }
}
