package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 289);
        Carro c2 = new Carro("Porche", 300);
        Carro c3 = new Carro("VW", 270);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        Carro.setVelocidadeLimite(120);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
