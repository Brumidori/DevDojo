package academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio;

public class Carro {
    private String nome;
    //final - constante em caixa alta e separada por _
    //nao pode ter valor alterado e geralemnte static - deve ser declarado quando inicializado
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    //pode ser inicalizado no bloco de ini, pois sempre eh executado pela JVM
    public final String COR;
    {
        COR = "vermelha";
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
}
