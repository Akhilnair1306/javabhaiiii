package java10_recursionqs;

import java.util.ArrayList;
// import java.util.Arrays;

public class MultipleOccurenceLinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr = {34,54,21,23,11,10,91, 21};
        System.out.println((MulOccurLinSearch(arr, answer, 20, 0)));
    }

    static ArrayList<Integer> MulOccurLinSearch(int[] arr, ArrayList<Integer> answer, int target, int index) {
        // ArrayList<Integer> answer = new ArrayList<>();
        if(index == arr.length) {
            return answer;
        }

        if ( arr[index] == target) {
            answer.add(index);
        }
        return MulOccurLinSearch(arr, answer, target, index+ 1);
    }
}
