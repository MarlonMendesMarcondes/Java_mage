package academy.devdojo.maratonajava.introdução;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //  € 1 to € 34,712	9.7%
        //  € 34,713 to € 68,507	37.35%
        //  € 68,508 +	49.5%
        double salarioAnual = 25000;
        double primeiraTaxa = 9.70/100;
        double segundaTaxa = 37.35/100;
        double terceiraTaxa = 49.5/100;
        double valorImposto;
        if (salarioAnual <= 34712){
            salarioAnual *= primeiraTaxa;
            System.out.println("Voce pagará uma taxa de "+ salarioAnual);
        } else if (salarioAnual >= 34713 && salarioAnual <= 68506) {
            salarioAnual *= segundaTaxa;
            System.out.println("Voce pagará uma taxa de "+ salarioAnual);
        } else {
            salarioAnual *= terceiraTaxa;
            System.out.println("Voce pagará uma taxa de "+ salarioAnual);
        }
    }
}
