package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
        //quando eh public faz sentido deixar o tratamento para quem chamar
        //com o lancamento de excecao na assinatura delega a responsabilidade pra qm chama
        File file = new File("arquivo\\teste.txt");
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);

    }
}
