package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }
    /*
    * param a
    * param b nao pode ser zero
    * @return
    * @throw IllegalArgumentException caso seja zeroRuntimeExceptionTest02
     */
    private static int divisao(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Argumento ilegal, nao pode ser 0");
        }
        return a/b;

    }
}
