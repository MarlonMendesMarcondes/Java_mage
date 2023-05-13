package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Dominio;

public class Carro {
    private String nome;
    public static double VELOCIDADE_LIMITE ;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
