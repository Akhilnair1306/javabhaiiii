package java5_sort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        CycleSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CycleSortAlgo(int[] arr) {
        int i = 0;
        while ( i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}
