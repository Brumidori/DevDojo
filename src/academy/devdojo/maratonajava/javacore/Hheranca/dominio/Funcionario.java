package academy.devdojo.maratonajava.javacore.Hheranca.dominio;


public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicializacao Static FUNCIONARIO");
    }
    {
        System.out.println("Dentro do bloco1 de inicializacao FUNCIONARIO");
    }
    {
        System.out.println("Dentro do bloco2 de inicializacao FUNCIONARIO");
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
        System.out.println("Dentro do construtor func");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor func");
    }

    public void imprime(){
       super.imprime();
        System.out.println(this.salario);
    }

    public void imprime2(){
        //pode puxar o atributo nome pois esta como protected
        System.out.println(this.nome);
    }
}
