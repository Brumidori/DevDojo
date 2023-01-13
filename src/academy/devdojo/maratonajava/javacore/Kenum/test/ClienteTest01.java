package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Jmodificadofinal.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("bruna", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("bruna", TipoCliente.PESSOA_JURIDICA);
//        Cliente cliente3 = new Cliente("bruna", "PESSOA_FISICA");
//        Cliente cliente4 = new Cliente("bruna", "PESSOA_JURIDICA");
        System.out.println(cliente);
        System.out.println(cliente2);

    }
}
