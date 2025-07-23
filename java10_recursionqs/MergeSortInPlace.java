package java10_recursionqs;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        // System.out.println(Arrays.toString(mrgsort(arr, 0, arr.length - 1)));
        mrgsort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mrgsort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return ;
        }

        int mid = start + ((end - start)/2);

        mrgsort(arr, start, mid);
        mrgsort(arr, mid, end);

        mrgsortinplace(arr, start, end, mid);

       
    }

    static void mrgsortinplace(int[] arr,int s, int e, int m) {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        while ( i < m && j < e){
            if ( arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
               
            }
            k++;
        }
        while ( i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while ( j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for ( int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
            // System.out.println(Arrays.toString(mix));
        }


    }
}
