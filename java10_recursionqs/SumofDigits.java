package java10_recursionqs;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sumofdig(333));
    }

    static int sumofdig(int n) {
        if ( n == 0) {
            return 0;
        }
        // int digit = n % 10;
        return n%10 + sumofdig( n / 10);
    }
}
