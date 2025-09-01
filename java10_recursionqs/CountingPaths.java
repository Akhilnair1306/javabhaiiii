package java10_recursionqs;

import java.util.ArrayList;
import java.util.List;

public class CountingPaths {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        // System.out.println(arr.length + " ----> length of array");
        // System.out.println(arr[0].length + "---->length");
        List<String> allPaths= new ArrayList<>();
        System.out.println(Countpaths(arr, 0, 0, "", allPaths));
        System.out.println(allPaths);
    }

    static int Countpaths(int[][] arr, int row, int col, String p, List<String> allPaths) {
        // List<String> allPaths= new ArrayList<>();
        int count = 0;
        if ( row == arr.length - 1 && col == arr[0].length -1) {
            count = count + 1;
            allPaths.add(p);
            return count;
        }

        if ( row == arr.length - 1) {
            count= count + Countpaths(arr, row, col + 1, p + "R", allPaths);
        } else if( col == arr[0].length - 1) {
            count = count + Countpaths(arr, row + 1, col, p + "D", allPaths);
        } else {
        count = count + Countpaths(arr, row, col + 1,p + "R", allPaths);
         count = count + Countpaths(arr, row + 1, col, p + "D", allPaths);

        }

         return count;
    }
}
