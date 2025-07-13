package java7_recursion;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonnacirecursion(8));
    }
    static int fibonnacirecursion (int n) {
        if ( n == 0) {
            return 0;
        } else if ( n == 1) {
            return 1;
        } else {
            return fibonnacirecursion(n - 1) + fibonnacirecursion(n -2);
        }
        
    }
}
