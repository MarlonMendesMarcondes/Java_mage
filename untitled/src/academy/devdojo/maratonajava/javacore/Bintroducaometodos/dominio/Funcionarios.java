package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    public String nome = null;
    public int idade = 0;
    public double[] salarios = null;

    public void imprime(){
        System.out.println("------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios != null) {
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
        }
        imprimeMediaSalario();
    }
    public void imprimeMediaSalario(){
        double media = 0;
        if(salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
           media /= salarios.length;
        }
        System.out.println("Media salarial " + media);
    }
}
