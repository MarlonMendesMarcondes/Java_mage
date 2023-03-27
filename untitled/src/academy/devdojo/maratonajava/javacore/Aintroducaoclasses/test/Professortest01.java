package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class Professortest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println(professor.nome + " idade:" + professor.idade+ " Sexo:" + professor.sexo);
    }
}
