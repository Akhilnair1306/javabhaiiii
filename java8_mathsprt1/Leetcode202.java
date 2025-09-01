

public class Leetcode202 {
    public static boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow =calc(slow);
            fast = calc(fast);
            System.out.println("fast 1 --> " + fast);
            fast = calc(fast);
            System.out.println("fast -->" + fast);
            System.out.println("slow -->" + slow);
            if ( slow == 1 || fast == 1) {
                return true;
            }
        }while ( fast != slow);
        return false;
    }
    public static int calc (int n) {
        int sum = 0;
        while ( n != 0) {
            int digit = n%10;
            sum += (digit * digit);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
