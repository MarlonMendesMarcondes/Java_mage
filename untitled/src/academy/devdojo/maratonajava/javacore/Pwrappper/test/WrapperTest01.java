package academy.devdojo.maratonajava.javacore.Pwrappper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP =1;
        short shortP =1;
        int intP = 1;
        long longP =10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW =1;
        Short shortW =1;
        Integer intW = 1;
        Long longW =10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;
        int i =intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = Integer.parseInt("2");
        boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(verdadeiro);
    }
}
