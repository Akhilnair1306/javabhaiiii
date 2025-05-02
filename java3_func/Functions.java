package java3_func;

import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("Printing " + a + " " + b);
        int[] arr = {10,20,30,40,50};
        modarr(arr);
        System.out.println(Arrays.toString(arr));
     }
    static int swap(int num1, int num2) {
        int temp = num1;
         num1 = num2;
         num2 = temp;
         return num1;
    }

    static void modarr (int[] arr1) {
        arr1[0] = 100;
    }
}
