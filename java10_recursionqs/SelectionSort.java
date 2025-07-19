package java10_recursionqs;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(selectsort(arr, arr.length - 1)));
    }

    static int[] selectsort(int[] arr, int end) {
        if ( end == 0) {
            return arr;
        }
        if(maxIndex(arr, end) != end) {
            swap(arr,maxIndex(arr, end),end);
        }
        // System.out.println(Arrays.toString(arr));
        return selectsort(arr, end -1);
    }

    static int maxIndex(int[] arr, int end) {
        int max= Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int max, int end) {
        int temp = arr[end];
        arr[end] = arr[max];
        arr[max] = temp;

    }
}
