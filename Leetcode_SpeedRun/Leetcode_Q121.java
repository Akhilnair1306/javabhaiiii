package Leetcode_SpeedRun;

public class Leetcode_Q121 {
    public static void main(String[] args) {
        SolutionQ121 solutionQ121 = new SolutionQ121();
        int[] arr = {7,6,4,3,1};
        int ans = solutionQ121.maxProfit(arr);
        System.out.println(ans);
    }

}

class SolutionQ121 {
    public int maxProfit(int[] prices) {
        //BAD APPROACH
        // int a = 0;
        // int b= prices.length - 1;
        // int max = 0;
        // while (a < prices.length - 2) {
        //     // System.out.println(a);
        //     while(a < b) {
        //         // System.out.println(a + "aa");
        //         // System.out.println(b + "bb");
        //     if (prices[a] >= prices[b]) {
        //         b--;
        //     }
        //     if (prices[a] < prices[b]) {
        //         int val = prices[b] - prices[a];
        //         // System.out.println(val + "val:" + prices[a] + " - " + prices[b]);
        //         max = Math.max(val, max);
        //         // System.out.println(max + "maxxx");
        //         b--;
        //     }
        // }
        // a++;
        // b = prices.length - 1;
        // }
        // return max;
        //OPTIMIZED APPROACH
        int profit = 0;
        int current_buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if ( prices[i] < current_buy) {
                current_buy = prices[i];
            }
            profit = Math.max((prices[i] - current_buy), profit);
        }
        return profit;
    }
}