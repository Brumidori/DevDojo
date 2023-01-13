package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
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
