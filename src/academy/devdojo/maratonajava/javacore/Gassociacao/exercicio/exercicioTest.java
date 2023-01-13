package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class exercicioTest {
    public static void main(String[] args) {
        Local local = new Local("Republica");
        Aluno aluno1 = new Aluno("Naruto", 13);
        Aluno aluno2 = new Aluno("Sakura", 12);
        Professor professor = new Professor("Kakashi", "jutsu");
        Seminario seminario = new Seminario("jutsus", local);
        Aluno[] alunos = {aluno1, aluno2};
        seminario.setAlunos(alunos);
        seminario.setProfessor(professor);
        seminario.imprime();

    }
}
