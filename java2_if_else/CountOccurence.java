package java2_if_else;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = in.nextInt();
        System.out.println("Enter the integer you want to count the occurence of ");
        int num1 = in.nextInt();
        int count = 0;
        do {
            if ( num % 10 == num1)
            {
                count++;
            }
            num = num/10;
        } while (num != 0);
        System.out.println(count);
    }
}
