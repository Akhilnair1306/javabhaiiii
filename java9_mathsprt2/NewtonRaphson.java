package java9_mathsprt2;

public class NewtonRaphson {
    public static void main(String[] args) {
        double n  = 40;
        System.out.println(sqrt(n));
    }

    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * ( x + (n/x));
            // double error = ;
            if ( Math.abs(root - x) < 0.01) {
                break;
            }
            x = root;
        }
        return x;
    }
}
