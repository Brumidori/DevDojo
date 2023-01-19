package academy.devdojo.maratonajava.javacore.Oexception.exception.test.dominio;

public class Funcionario extends Pessoa{
    public void salvar() throws  LoginInvalidoException, ArithmeticException{
        //ao sobrescrever nao eh necessario implementar as mesmas excecoes
        //pode adicionar excecoes unchecked
        //nao pode adc excecoes mais genericas ou do tipo checked (que nao seja declarada na super)
        System.out.println("Salvando funcionario");
    }
}
