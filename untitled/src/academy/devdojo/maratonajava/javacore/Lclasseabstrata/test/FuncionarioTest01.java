package academy.devdojo.maratonajava.javacore.Lclasseabstrata.test;

import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclasseabstrata.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Marlon", 10000);
        Gerente gerente = new Gerente("cleberson",6000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
