package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //modificador static - pertence a classe e nao instancia
    //uma vez alterado afeta todos os objetos
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima ) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("--------");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidade maxima: " + this.velocidadeMaxima);
        System.out.println("velocidade limite: " + Carro.velocidadeLimite);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
