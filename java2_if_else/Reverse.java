package java2_if_else;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        while (num != 0 ) {
            int num1 = num % 10;
            ans = ans * 10 + num1;
            num = num /10;
        }
        System.out.println(ans);
    }
}
