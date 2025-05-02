package java3_func;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = Armstrong1(n);
        System.out.println(ans);
    }

    static boolean Armstrong1 (int n) {
        int no = n;
        int sum = 0;
        while  ( n != 0 ) {
            int sing_digit  = n % 10;
            int cube = sing_digit * sing_digit * sing_digit;
            sum += cube;
            n = n /10;
        }
        return no == sum;
    }
}
