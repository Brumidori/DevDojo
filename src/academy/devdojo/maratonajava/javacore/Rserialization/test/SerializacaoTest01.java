package academy.devdojo.maratonajava.javacore.Rserialization.test;

import academy.devdojo.maratonajava.javacore.Rserialization.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    //serializar eh persistir um objeto atraves de um array de bytes - no exemplo abaixo persistimos
    //em um arquivo aluno.ser

    public static void main(String[] args) {
//        Aluno aluno = new Aluno(1L, "Bruna Midori", "12345678");
//        serializar(aluno);
        deserializar();
        //executor nao eh executado na deserializacao
    }

    private static void serializar(Aluno aluno){
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("aluno.ser")))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }

    private static void deserializar(){
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("aluno.ser")))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } ;
    }
}
