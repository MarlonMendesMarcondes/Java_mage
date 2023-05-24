package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

import java.io.ObjectStreamException;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //checked and unchecked
        Object object = null;
        int[] nums = {1,2};
        System.out.println(object.toString());
        System.out.println(nums[2]);
    }
}
