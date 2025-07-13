package java6_patterns;
public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
    }

    static void pattern1 (int n) {
        for (int row = 1 ; row <= n; row++) {
            for (int col = 1; col <= 5;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4 (int n) {
        for (int row =1; row <= n; row++) {
            for (int col = 1 ; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5 (int n) {
        for (int row = 1; row <= (2*n) -1; row++){
            int c = 0;
            if (row > n) {
                c = (2*n) - row ;
            } else {
                 c = row;
            }
            for (int col = 1 ; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
