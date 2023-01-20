package academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio;

public class Comprador {
    private String nome;

    public Comprador(String nome) {
        this.nome = nome;
    }
    public Comprador() {}

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
