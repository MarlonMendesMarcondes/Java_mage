package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("tazmania");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("enzo");
        ferrari.imprime();

    }
}
