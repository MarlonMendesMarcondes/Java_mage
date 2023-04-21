package academy.devdojo.maratonajava.javacore.Gassociacao.test;

public class JogadorTest01 {
    public static void main(String[] args) {
        JogadorTest03.Jogador jogador1 = new JogadorTest03.Jogador("Pelé");
        JogadorTest03.Jogador jogador2 = new JogadorTest03.Jogador("Romario");
        JogadorTest03.Jogador jogador3 = new JogadorTest03.Jogador("Cafu");

        JogadorTest03.Jogador[] jogadores = new JogadorTest03.Jogador[]{jogador1,jogador2,jogador3};
        for (JogadorTest03.Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
