package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class Produtotest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Macbook",5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());

        Produto produto2 = new Tomate("cereja",10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());

    }
}
