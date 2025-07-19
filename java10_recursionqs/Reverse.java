package java10_recursionqs;

public class Reverse {
    public static void main(String[] args) {
        int a = 123432;
        boolean palindrome = ( a == Reverseno(123432));
        System.out.println(palindrome);
        // System.out.print(Reverseno(5432101));
        // Reverseno(1030);
    }

    static  int Reverseno ( int n) {
        int args = (int) (Math.log10(n) + 1);
        return helper(n, args);
    }

    static int helper ( int n, int arguments) {
        if ( n %10 == n) {
            return n;
        }
        return n%10 * (int)Math.pow(10, arguments -1) + helper( n/10, arguments -1);
    }
}
