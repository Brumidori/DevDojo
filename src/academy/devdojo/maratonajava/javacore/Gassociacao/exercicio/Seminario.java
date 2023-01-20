package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;


import java.util.Arrays;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime(){
        System.out.println("Seminario " +this.titulo);
        System.out.println("Local: "+ this.local.getEndereco());
        if(alunos != null){
            System.out.println("Alunos: ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome() + " ");
            }
        }
        if(professor != null){
            System.out.println("\nProfessor: " + professor.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
