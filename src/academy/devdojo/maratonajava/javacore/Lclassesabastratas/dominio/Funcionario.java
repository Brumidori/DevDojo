package academy.devdojo.maratonajava.javacore.Lclassesabastratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public abstract void calculaBonus();

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    //se implementar o metodo abstrato resolve para as filhas
    @Override
    public void imprime() {
        System.out.println("imprindo");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
