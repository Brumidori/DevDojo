package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor1 = new Professor("Kakashi");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("dev", professores);

        escola.imprime();
    }
}
