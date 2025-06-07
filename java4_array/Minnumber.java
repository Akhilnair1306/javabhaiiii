package java4_array;

import java.util.Scanner;

public class Minnumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for ( int i = 0 ; i < size ; i++) {
            System.out.println("Enter the number of the array");
            array[i] = input.nextInt();
        }
        System.out.println("The min number of the array is ");
        System.out.println(min(array));
    }

    static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        if(array.length == 0) {
            return -1;
        }
        for (int i = 0 ; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
