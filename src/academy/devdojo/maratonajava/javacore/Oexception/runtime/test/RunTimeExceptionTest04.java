package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndex");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dentro do IndexOut");
        } catch (IllegalArgumentException e) {
            System.out.println("dentro do Illegal");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            //nao pode colocar a excecao mais generica antes
        }

        try{
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e){
            //pode colocar em linha excecoes - desde q nao na mesma linha de herança
            e.printStackTrace();
        }
    }


    private static void talvezLanceException() throws SQLException, FileNotFoundException{}
}
