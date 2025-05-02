package java3_func;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int a  = in.nextInt();
        boolean ans = PrimeNum(a);
        System.out.println(ans);

    }
    static boolean PrimeNum(int a) {
        int c = 2 ;
        if ( a <= 1) {
            return false;
        }
        while ( c * c <= a) {
            if ( a % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > a;
    }
}
