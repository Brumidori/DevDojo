package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int [] episodios;
    //0 - bloco de inicializacao estatico eh executado quando a JVM carregar a classe
    //1 - alocado espaco em memoria pro objeto
    //2 - cada atributo de classe e criado e incializado com valores dafaut ou oq for passado
    //3 - bloco de inicializacao e executado
    //4 - contrutor e executado
    static{
        //bloco de inicializacao de instancia - entre atributos e construtores
        //executa toda vez que inicializar um objeto
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++ ){
            episodios[i] = i+1;
        }
    }

    static{
        System.out.println("dentro do bloco static 2");
        }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for(int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
