package academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio;

public enum TipoCliente {
    //tipo cliente eh enum e a pes fisica/jur eh do tipo cliente
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");
    //atributos vem depois
    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePotNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
