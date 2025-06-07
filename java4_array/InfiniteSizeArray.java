package java4_array;

public class InfiniteSizeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(ans(arr, 3));
    }
    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        if( target > arr[end]) {
            int newStart = end + 1;
            end  = 2*(end - start + 1) + end;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch( int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            if ( arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
