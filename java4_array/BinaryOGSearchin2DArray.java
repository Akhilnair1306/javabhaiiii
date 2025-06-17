package java4_array;

import java.util.Arrays;

public class BinaryOGSearchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(ReduceSearchSpace(arr, 9)));
    }
    static int[] BinarySearch(int[][] matrix, int rStart,  int cStart,int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + ((cEnd - cStart) / 2);
            if ( matrix[rStart][mid] == target) {
                return new int[]{rStart, mid};
            }
            if (matrix[rStart][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] ReduceSearchSpace(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        while (rows == 1) {

        }
        int cStart = 0;
        int cEnd = cols - 1;
        int rStart = 0;
        int rEnd = rows - 1;
        int midCol = cStart + ((cEnd - cStart) / 2);
        while (rStart < (rEnd - 1)) {
            int mid = rStart + ((rEnd - rStart) / 2);
            if (matrix[mid][midCol] == target) {
                return new int[]{mid, midCol};
            } else if (matrix[mid][midCol] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (target == matrix[rStart][midCol]) {
            return new int[]{rStart, midCol};
        }
        if (target == matrix[rStart + 1][midCol]) {
            return new int[]{rStart + 1, midCol};
        }
        if (target <= matrix[rStart][midCol - 1]) {
            return BinarySearch(matrix, rStart, 0, midCol - 1, target);
        }
        // 2nd quadrant
        if (target >= matrix[rStart][midCol + 1] && target <= matrix[rStart][cols - 1]) {
            return BinarySearch(matrix, rStart, midCol + 1, cols - 1, target);
        }
        // 3rd quadrant
        if (target <= matrix[rStart + 1][midCol - 1]) {
            return BinarySearch(matrix, rStart + 1, 0, midCol - 1, target);
        }
        // 4th quadrant
        else {
            return BinarySearch(matrix, rStart + 1, midCol + 1, cols - 1, target);
        }
        
    }
}
