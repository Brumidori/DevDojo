package academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio;

public enum TipoCliente {
    //tipo cliente eh enum e a pes fisica/jur eh do tipo cliente
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    //atributos vem depois
    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }

}
