package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei","Gejutsu");
        Professor[] professores = {professor};
        Escola escola = new Escola("Academia de Konoha", professores);
        professor.imprime();

        escola.imprime();

    }
}
