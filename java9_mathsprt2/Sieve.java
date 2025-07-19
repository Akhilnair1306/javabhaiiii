package java9_mathsprt2;

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];
        SieveofErathosenues(n, prime);
    }
    static void SieveofErathosenues(int n, boolean[] prime) {
        for(int i = 2; i * i < n; i++) {
            // System.out.println("working");
            if (!prime[i]) {
                for(int j = i*2; j<= n; j+=i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            // System.out.println("working final");
            if (!prime[i]){

                System.out.print(i + " ");
            }
        }
    }
}
