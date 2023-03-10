package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    //sobrecarga de metodos - mesmo nome e tipo (assinatura) mas parametros diferentes
    public Anime(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public Anime(String nome, String tipo, int episodios, String genero){
       new Anime(nome, tipo, episodios);
       this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.nome);
        System.out.println(this.episodios);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
