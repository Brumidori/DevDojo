package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
    Jogador jogador = new Jogador("Cafu");
    Jogador jogador2 = new Jogador("Pele");
    Time time = new Time("BR");
    Jogador[] jogadores = {jogador, jogador2};

    //add pele como jogador no time, mas nao relacionei o time ao jogador
        //relacionamento birediconal pode dar inconsistencia
    jogador.setTime(time);
    time.setJogadors(jogadores);

        System.out.println( "----------------Jogador --------"
        );
        jogador.imprime();
        System.out.println("-----------TIME------------");
        time.imprime();
    }

}
