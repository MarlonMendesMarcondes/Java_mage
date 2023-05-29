package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class Funcionario extends Pessoa{
    public void salvar()throws LoginInvalidoException, RuntimeException{
        System.out.println("salvando funcionario");
    }
}
