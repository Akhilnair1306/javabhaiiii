package java5_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SelectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = BiggestIndex(arr,0,last);
            swap(arr, max, last);
        }
    }
    static int BiggestIndex(int[] arr,int start,int end) {
        int big = Integer.MIN_VALUE;
        int max_index = 0;
        for ( int i = start ; i <= end; i++) {
            if (arr[i] > big) {
                big = arr[i];
                max_index = i;
            }
        }
        return max_index;
    }
    static void swap (int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp; 
    }
}
