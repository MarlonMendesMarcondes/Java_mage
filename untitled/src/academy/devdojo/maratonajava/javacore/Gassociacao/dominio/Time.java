package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import academy.devdojo.maratonajava.javacore.Gassociacao.test.JogadorTest03;

public class Time {
    private String nome;
    private JogadorTest03.Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, JogadorTest03.Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }
    public void imprime(){
        System.out.println(this.nome);
        if(jogadores == null) return;
        for (JogadorTest03.Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        }
    }


    public void setJogadores(JogadorTest03.Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }



}
