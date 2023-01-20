package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();
        fileLoader.remove();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();
    }
}
