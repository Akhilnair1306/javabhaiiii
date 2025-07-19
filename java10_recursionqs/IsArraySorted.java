package java10_recursionqs;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,15,6};
        System.out.println(IsSorted(arr, 0));
    }

    static boolean IsSorted(int[] arr, int n) {
        if ( n == arr.length - 1) {
            return true;
        }
        // if ( ) {
        //     return false;
        // }<
        return arr[n] < arr[n + 1] && IsSorted(arr, n + 1);
    }
}
