package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //contrato - deve ser implementado
    void load();

    //a partir do java 8 pode fazer metodos default com implementacao
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoes");
    };

    //os atributos em interface sao public e os metodos que implementam nao podem ser mais restritivos

    //eh possivel declarar variaveis (constantes)
    public static final int MAX_DATA_SIZE = 10;

    public static void retieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
