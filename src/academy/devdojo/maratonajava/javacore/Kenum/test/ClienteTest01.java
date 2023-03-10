package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("bruna", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("bruna", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoCliente.tipoClientePotNomeRelatorio("Pessoa fisica"));

    }
}
