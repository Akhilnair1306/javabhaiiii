public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(RangeXORCalc(a - 1, b));
    }

    static int RangeXORCalc ( int a, int b) {
        int first_half = 0;
        if ( b % 4 == 0) {
            first_half = b;
        } else if ( b % 4 == 1) {
            first_half = 1;
        } else if (b % 4 == 2) {
            first_half = b + 1;
        } else {
            first_half = 0;
        }
        int second_half = 0;
         if ( a % 4 == 0) {
            second_half = a;
        } else if ( a % 4 == 1) {
            second_half = 1;
        } else if (a % 4 == 2) {
            second_half = a + 1;
        } else {
            second_half = 0;
        }
        return first_half ^ second_half;
    }
}
