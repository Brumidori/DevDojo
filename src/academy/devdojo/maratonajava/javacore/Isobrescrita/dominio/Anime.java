package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    @Override
    //override tem que ser o mesmo nome e mesma qtde de parametros - acesso nao pode ser mais restritivo
    public String toString(){
        return this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
