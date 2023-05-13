package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("chuchu", TipoCliente.PESSOA_FISICA,Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("chuchu",TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("chuchu",TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("chuchu",TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
