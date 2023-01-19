package academy.devdojo.maratonajava.javacore.Oexception.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;
import academy.devdojo.maratonajava.javacore.Oexception.exception.test.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.test.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.test.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            //nao precisa tratar unchecked (Arithmetic)
            throw new RuntimeException(e);
        }
    }
}
