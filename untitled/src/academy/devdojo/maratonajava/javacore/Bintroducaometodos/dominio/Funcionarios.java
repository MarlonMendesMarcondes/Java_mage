package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
