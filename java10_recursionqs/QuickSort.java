package java10_recursionqs;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        quicksrt(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
        
    }

    static void quicksrt(int[] arr, int low, int high) {
        if ( low >= high) {
            return;
        }
        int pivot = arr[high];
        int start = low;
        int end = high;
        while ( start <= end) {
            while ( arr[start] < pivot) {
                start++;
            }
            while ( arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quicksrt(arr, low, end);
        quicksrt(arr, start, high);



    }
}
