package academy.devdojo.maratonajava.javacore.Jmodificadofinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COR);
        System.out.println(carro.COMPRADOR);

        Comprador comprador2 = new Comprador();
        //nao consigo trocar o comprador do carro por comprador2 - pois é final
        carro.COMPRADOR.setNome("Kiririn");
        System.out.println(carro.COMPRADOR);

    }
}
