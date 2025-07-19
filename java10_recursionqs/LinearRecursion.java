package java10_recursionqs;

public class LinearRecursion {
    public static void main(String[] args) {
        int[] arr = {23,45,12,435,52,232};
        System.out.println(LinearSearch(arr, 0, 4356));
    }

    static int LinearSearch (int[] arr, int index, int target) {
        if ( arr[index] != target && index == arr.length -1 ) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return LinearSearch(arr, index + 1, target);
    }
}
