package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import org.w3c.dom.ls.LSOutput;

public class RunTimeExceptionTest01 {
    //excecoes unchecked RuntimeException (filha de Exception)
    //nao precisa de tratamento para compilar
    // Excepetion eh checked - filha de throwable - precisa de tratamento para compilar
    //error nao eh exception - filha de throwable

    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString());
        //compila, mas lanca excpetion nullPointerException
    }

}
