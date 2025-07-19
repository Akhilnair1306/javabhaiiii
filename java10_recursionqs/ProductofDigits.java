package java10_recursionqs;

public class ProductofDigits {
    public static void main(String[] args) {
        System.out.println(prod(2221));
    }
    static int prod(int n) {
        if ( n < 10) {
            return n;
        }

        return (n%10) * prod(n/10);
    }
}
