package academy.devdojo.maratonajava.javacore.Rserialization.test;


import academy.devdojo.maratonajava.javacore.Rserialization.dominio.Aluno2;
import academy.devdojo.maratonajava.javacore.Rserialization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializacaoTest02 {
    //serializar eh persistir um objeto atraves de um array de bytes - no exemplo abaixo persistimos
    //em um arquivo aluno.ser

    public static void main(String[] args) {
        Aluno2 aluno = new Aluno2(1L, "Bruna Midori YY", "12345678");
        Turma turma = new Turma("Maratona Virado no Jiraya");
        aluno.setTurma(turma); //- da erro, pois turma nao eh serializavel
        serializar(aluno);
        deserializar();
        //executor nao eh executado na deserializacao
    }

    private static void serializar(Aluno2 aluno){
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("aluno2.ser")))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }

    private static void deserializar(){
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("aluno2.ser")))) {
            Aluno2 aluno = (Aluno2) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } ;
    }
}
