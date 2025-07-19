package java10_recursionqs;

public class OnetoN {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
