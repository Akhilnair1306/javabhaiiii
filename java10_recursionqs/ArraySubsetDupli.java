package java10_recursionqs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubsetDupli {
    public static void main(String[] args) {
        int[] arr = { 40,50 ,50};
        // System.out.println(Arraysubduplicates(arr));
        System.out.println(Arraysubduplicates2(arr));
    }

    static List<List<Integer>> Arraysubduplicates (int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        for (int num: arr) {
            // System.out.println(num);
            int n = answer.size();
            for (int i =0; i< n; i++) {
                List<Integer> internalAnswer = new ArrayList<>(answer.get(i));
                internalAnswer.add(num);
                // boolean ifDuplicate = isDuplicate(answer, internalAnswer);
                // System.out.println(ifDuplicate + "" + internalAnswer);
                if (!isDuplicate(answer, internalAnswer)) {
                    answer.add(internalAnswer);
                }
            }
        }
        return answer;
    }

    static boolean isDuplicate(List<List<Integer>> outer, List<Integer> internal) {
        // System.out.println(outer+ "----->outer List in isduplicate func");
        // System.out.println(internal + "---->Internal in isduplicate func");
        for (int i = 0 ; i < outer.size(); i++) {
            // System.out.println(outer.get(i) + "-----> outer in is dupli for loop");
            // System.out.println(internal + " ---> Internal in is dupli for loop");
            // System.out.println(outer.get(i) + "-----> outer in is dupli for loop");
            if (outer.get(i).equals(internal)) {
                return true;
            }
        }
        return false;
    }

     static List<List<Integer>> Arraysubduplicates2 (int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(arr);
        answer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int num: arr) {
            start = 0;
            int j = 0;
            if ( j > 0 && arr[j] == arr[j -1]) {
                    start = end + 1;
            }
            // System.out.println(num);
            end = answer.size();
            for (int i =start; i< end; i++) {
                List<Integer> internalAnswer = new ArrayList<>(answer.get(i));
                internalAnswer.add(num);
                // boolean ifDuplicate = isDuplicate(answer, internalAnswer);
                // System.out.println(ifDuplicate + "" + internalAnswer);
                if (!isDuplicate(answer, internalAnswer)) {
                    answer.add(internalAnswer);
                }
            }
            j++;
        }
        return answer;
    }
}
