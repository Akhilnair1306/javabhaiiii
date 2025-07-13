package java7_recursion;

public class BinaryRecursion {
    public static void main(String[] args) {
        int[] arr = {0 , 5 , 4,6, 9};
        System.out.println(BinarySearch(2, arr, 0, arr.length - 1));
    }
    static int BinarySearch( int n, int[] arr, int start, int end) {
        if ( start > end) {
            return -1;
        }
        int mid = start + (( end - start) /2);
        if ( arr[mid] == n) {
            return mid;
        } 
         if ( arr[mid] > n) {
            return BinarySearch(n, arr, 0 , mid -1);
        } 
           return BinarySearch(n, arr, mid + 1, end);  
    }
}
