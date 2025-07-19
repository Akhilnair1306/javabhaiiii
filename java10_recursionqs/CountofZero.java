package java10_recursionqs;

public class CountofZero {
    public static void main(String[] args) {
        // int count = 0;
        int n = 1000101010;
        System.out.println(counting(n, 0));
    }
    static int counting( int n, int count) {
        if ( n == 0) {
            return count;
        }
        if ( n% 10 == 0) {
            // count++;
            return counting(n/10, count+1);
        }
        return counting(n/10, count);
    }
}
