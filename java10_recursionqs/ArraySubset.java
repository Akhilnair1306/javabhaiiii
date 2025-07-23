package java10_recursionqs;

import java.util.ArrayList;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        System.out.println(SubsetsinanArray(arr));
    }

    static ArrayList<ArrayList<Integer>> SubsetsinanArray (int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for ( int num: arr) {
            int n = outer.size();
            // System.out.println(n + " ----> Size of outer");
            for ( int i = 0; i < n; i++) {
                ArrayList<Integer> internal= new ArrayList<>(outer.get(i));
                // System.out.println(outer.get(i) + "--> Just to se what this prints");
                internal.add(num);
                // System.out.println(internal+ "----> Internal Array");
                outer.add(internal);
                // System.out.println(outer+ "----> outer Array");
            }
        }
        return outer;
    }
}
