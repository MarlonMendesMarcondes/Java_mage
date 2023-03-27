package academy.devdojo.maratonajava.introdução;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar");
        }else {
            System.out.println("Nao Autorizado a comprar");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Nao Autorizado a comprar");
        }
        boolean c = true;
        if (c == false){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
