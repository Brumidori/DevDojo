package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professors;

    public Escola(String nome, Professor[] professors) {
        this.nome = nome;
        this.professors = professors;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(professors != null){
            for (Professor professor : professors) {
                System.out.println(professor.getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
