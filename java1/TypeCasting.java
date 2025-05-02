package java1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        int sum = (int)(num1 + num2) ;
        System.out.println(sum);

        int a = 259;
        byte b = (byte) a;
        System.out.println(b);

    }
}
