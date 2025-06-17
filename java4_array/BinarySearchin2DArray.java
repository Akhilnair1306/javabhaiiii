package java4_array;

import java.util.Scanner;

public class BinarySearchin2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number of rows");
        // int rows = input.nextInt();
        // System.out.println("Enter the number of columns");
        // int columns = input.nextInt();
        // int[][] arr = new int[rows][columns];
        // for( int i = 0; i < rows; i++) {
        //     for(int j = 0; j < columns; j++) {
        //         arr[i][j] = input.nextInt();
        //     }
        // }
        int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
        System.out.println(Searchin2DArray(arr, 6));
    }

    static int Searchin2DArray( int[][] arr, int target) {
        int rows = 0;
        int col = arr[rows].length - 1;
        while ( col > 0 || rows > arr.length - 1) {
            if (arr[rows][col] == target) {
                return 1;
            } else if(arr[rows][col] > target) {
                col--;
            } else {
                rows++;
            }
        }
        return -1;
    }
}
