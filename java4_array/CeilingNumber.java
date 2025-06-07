package java4_array;
public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16};
       int ans =  Ceiling(arr, 15);
       System.out.println(ans);

    }
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[end] < target) {
            return -1;
        }
        // int closest_num = Integer.MAX_VALUE;
        while(start <= end) {
            int mid = (start + end) / 2;
            if( arr[mid] == target) {
                return arr[mid];
            }
            if ( arr[mid] < target) {
                start = mid + 1;
            }
            if ( arr[mid] > target) {
                end = mid - 1;
                // int diff = arr[mid] - target;
                // if ( diff <= closest_num) {
                //     closest_num = diff;
                // }
            }
        }
        return arr[start];
    }
}
