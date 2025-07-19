public class MagicNumber {
    //Amazon question
    public static void main(String[] args) {
        // int base= 5;
        int n = 5;
        System.out.println(CalcMagicNumber(n));
    }

    static int CalcMagicNumber(int n) {
        int base = 5;
        int ans = 0;
        while ( n > 0) {
            if ( (n & 1) == 1) {

                ans += base;
            }
            n = n >> 1;
            base = base * 5;
            // System.out.println("Value of base after each iteration");
            // System.out.println(base);
            // System.out.println("Value of answer after each iteration");
            // System.out.println(ans);
            // System.out.println("Value of n after each iteration");
            // System.out.println(n);
        }
        return ans;
    }
}
