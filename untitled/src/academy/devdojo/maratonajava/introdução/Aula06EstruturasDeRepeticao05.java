package academy.devdojo.maratonajava.introdução;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro descubra quantas vezes ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela =(int) 30000; parcela >= 1; parcela--) {
            double valorParcela = valorTotal/ parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }



    }
}
