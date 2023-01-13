package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    //protected da acesso as classes filhas e mesmo pacote como se fosse public
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicializacao Static PESSOA");
    }
    {
        System.out.println("Dentro do bloco1 de inicializacao PESSOA");
    }
    {
        System.out.println("Dentro do bloco2 de inicializacao PESSOA");
    }
    public  Pessoa (){}
    public Pessoa(String nome){
        System.out.println("dentro do contrutor de pessoa");
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println(this.getNome());
        System.out.println(this.getCpf());
        System.out.println(this.getEndereco().getRua());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
