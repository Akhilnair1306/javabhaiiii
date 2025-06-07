package java4_array;

import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println(" Enter the size of the array");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size ; i++)
        {
            System.out.println("Enter the numbers "+ (i + 1));
            array[i] = input.nextInt();
        }

        //print out the array
        for ( int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println("Enter your option: 1. Reverse 2. Swap");
        int optn  = input.nextInt();
        if (optn == 2) {
            swap(array, 1, 4);
        } else {
            Reverse(array);
        }
        
        System.out.println(" ");
        for ( int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        // System.out.println();
    }

    static void swap(int arr[], int pos1, int pos2) {
        //swap the given numbers
        if ( pos1 > arr.length || pos2 > arr.length){
            System.out.println("Please Enter a valid index to swap");
        }
        int temp;
        // arr[pos1] = temp;
        temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;


    }

    static void Reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1 ;
        int temp;
        while ( i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
