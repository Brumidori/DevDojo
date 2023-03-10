package academy.devdojo.maratonajava.javacore.Oexception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.test.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.test.dominio.Leitor2;

import java.io.*;

public class TryVithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerAruivo1(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e){

        }
    }

    public static void lerArquivo(){
        Reader reader = null;
        try {
        reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try{
                if(reader != null){
                    reader.close();
                }
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
}
