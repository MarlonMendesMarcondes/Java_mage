package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        funcionario.nome = "Naruto";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{3000,5000,40000};

        funcionario.imprime();
    }
}
