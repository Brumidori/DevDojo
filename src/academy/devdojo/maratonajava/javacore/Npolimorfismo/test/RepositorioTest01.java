package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBacoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBacoDeDados();
        repositorio.salvar();
        Repositorio repositorio1 = new RepositorioArquivo();
        repositorio1.salvar();


    }
}
