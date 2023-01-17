package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //contrato - deve ser implementado
    void load();

    //a partir do java 8 pode fazer metodos default com implementacao
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoes");
    };
}
