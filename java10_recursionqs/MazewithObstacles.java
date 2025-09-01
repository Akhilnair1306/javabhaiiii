package java10_recursionqs;

import java.util.ArrayList;
import java.util.List;

public class MazewithObstacles {
    public static void main(String[] args) {
        int[][] arr = {{0,-1,-1,-1},
                    {0,-1,-1,-1},
                    {0,0,0,0}};

        System.out.println(mazePathways(arr, 0, 0, ""));
    }

    static List<String> mazePathways(int[][] arr, int rows, int cols, String p) {
        List<String> answer = new ArrayList<>();
        if ( rows == arr.length - 1 && cols == arr[0].length - 1) {
            answer.add(p);
            return answer;
        }

        if ( arr[rows][cols] == -1) {
            return answer;
        }

        if ( rows == arr.length - 1 ) {
            answer.addAll(mazePathways(arr, rows, cols + 1, p + "R"));
        } else if ( cols == arr[0].length - 1) {
            answer.addAll(mazePathways(arr, rows + 1, cols, p + "D"));
        } else {
            answer.addAll(mazePathways(arr, rows, cols + 1, p + "R"));
            answer.addAll(mazePathways(arr, rows + 1, cols, p + "D"));
        }
        return answer;
    }
}
