package academy.devdojo.maratonajava.javacore.Oexeption.exception.test;

public class IllegalArgumentException {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }
    private static int divisao(int a, int b){
        if (b==0){
            throw new RuntimeException("Argumento ilegal, nao pode ser 0");
        }
        return a/b;

    }
}
