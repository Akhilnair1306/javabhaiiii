package Leetcode_SpeedRun;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
public class Leetcode_Q1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
