package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String studio;

    //sobrecarga de metodos - mesmo nome e tipo (assinatura) mas parametros diferentes
    //construtores nao tem retorno
    //this so funciona em construtor e na PRIMEIRA linha executavel
    public Anime(String nome, String tipo, int episodios){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public Anime(String nome, String tipo, int episodios, String genero){
        this(nome, tipo, episodios);
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String studio){
        this(nome, tipo, episodios, genero);
        this.studio = studio;
    }

    public Anime (){
        System.out.println("Dentro do construtor vazio");
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
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
