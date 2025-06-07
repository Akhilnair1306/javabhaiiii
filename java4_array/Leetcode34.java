package java4_array;

import java.util.Scanner;

public class Leetcode34 {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] nums = new int[size];
        for (int i = 0 ; i < size; i++) {
            nums[i] = input.nextInt();
        }
        int[] ans = searchRange(nums, 7);
        System.out.println("Answer" + ans[0] + " " + ans[1]);
        
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        arr[0] = search(nums, target, true);
        arr[1] = search(nums, target, false);
        return arr;
    }
    public static int search(int[] nums, int target, boolean findFirstElement) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while ( start <= end) {
            int mid  = start + ((end - start) / 2);
            if ( nums[mid] > target) {
                 end = mid -1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirstElement) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
