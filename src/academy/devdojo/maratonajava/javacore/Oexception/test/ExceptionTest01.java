package academy.devdojo.maratonajava.javacore.Oexception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e){
            System.out.println("nao foi possivel criar arquivo. " + e.getMessage());
            e.printStackTrace();
        }

        //nao compila sem tratamento
    }
}
