package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1- alocado espaço na memoria pro objeto
    // 2- cada atribnuto de classe é criado na inicialização com valores default ou o quer for passada
    // 3- Bloco de inicializaçao e executado
    // 4- Construtor é executado
    {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        System.out.println(episodios);
        for (int episodio: this.episodios){
            System.out.println(episodio + "");
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
