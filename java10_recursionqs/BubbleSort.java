package java10_recursionqs;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        System.out.println(Arrays.toString(bubblsort(arr, arr.length - 1, 0)));

    }

    static int[] bubblsort(int[] arr, int end, int i) {

         if (end == 0) {
            return arr;
        }

        if ( i == end ) {
            end = end - 1;
            return bubblsort(arr, end, 0);
        }

       
        
        if ( arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return bubblsort(arr, end, i + 1);
    }
}
