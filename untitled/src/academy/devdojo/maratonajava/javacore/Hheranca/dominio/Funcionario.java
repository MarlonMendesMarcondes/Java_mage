package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario  extends Pessoa{

    private double salario;
    static{
        System.out.println("Dentro do bloco de inicialização estatico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);

    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
        System.out.println("Dentro do construtor de Funcionario 2");
    }
    public void relatorioPagamento(){
        System.out.println("EU "+this.nome+ "recebi o salario de "+ this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


