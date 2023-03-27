package academy.devdojo.maratonajava.introdução;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemnaoDoar = "Nao tenho condiçoes, mas vou ter";
        // (condiçao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemnaoDoar;

        System.out.println(resultado);

    }
}



