package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - bloco de inicialização estatico da super classe é executado quando a JVM carrega classes pai
    // 1 - bloco de inicialização estatico da sub classe é executado quando a JVM carrega classes filho
    // 2 - Alocado espaço em memoria pro objeto da classe pai
    // 3 - Cada atributo de classe pai é criado e inicializado com valores default ou o quer for passado da classe pai
    // 4 - Bloco de inicializacao da superclasse é executado
    // 5 - Construtor é executado da  superclasse
    // 6 - Alocado espaço em memoria pro objeto da subclasse
    // 7 - Cada atributo de subclasse pai é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicializacao da subclasse é executado
    // 9 - Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("jiraya");
    }
}
