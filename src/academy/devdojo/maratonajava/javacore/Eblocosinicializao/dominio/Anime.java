package academy.devdojo.maratonajava.javacore.Eblocosinicializao.dominio;

public class Anime {
    private String nome;
    private int [] episodios;
    //1 - alocado espaco em memoria pro objeto
    //2 - cada atributo de classe e criado e incializado com valores dafaut ou oq for passado
    //3 - bloco de inicializacao e executado
    //4 - contrutor e executado
    {
        //bloco de inicializacao de instancia - entre atributos e construtores
        //executa toda vez que inicializar um objeto
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++ ){
            episodios[i] = i+1;
        }
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for(int episodio : episodios){
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
