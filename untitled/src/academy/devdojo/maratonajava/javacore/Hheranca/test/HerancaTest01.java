package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Roberto Senpai");
        Time time = new Time("Brasil");
        time.imprime();
        pessoa.setCpf("6549866498");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("oda nobugana");

        funcionario.setCpf("222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4645641);

        funcionario.imprime();
    }
}
