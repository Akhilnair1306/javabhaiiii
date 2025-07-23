package java10_recursionqs;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5};
        System.out.println(Arrays.toString(mrgsort(arr)));
        // mrgsort(arr, 0, arr.length, 0);
    }

    static  int[] mrgsort(int[] arr) {
        // int[] ans = new int[arr.length];
            if ( arr.length == 1) {
                return arr;
            }
            int mid = arr.length/2;
            int[] left = mrgsort(Arrays.copyOfRange(arr,0,mid));
            int[] right = mrgsort(Arrays.copyOfRange(arr,mid,arr.length));
            
            return merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];

        int k = 0;
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if ( left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
                k++;
        }

        while ( i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }

        while ( j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }
    
}