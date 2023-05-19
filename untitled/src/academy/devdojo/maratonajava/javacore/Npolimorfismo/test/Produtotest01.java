package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class Produtotest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("IMAC",12000);
        Tomate tomate = new Tomate("Tomate cereja",10);
        Televisao televisao = new Televisao("samsung",2500);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
