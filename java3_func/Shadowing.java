package java3_func;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        // int x = 90;
        if (x == 90) {
            int x = 80;
            System.out.println(x);
        }

    }
}