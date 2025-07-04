package java4_array;
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarysearchalgo(array, 9));
    }

    static int binarysearchalgo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid =( start + end )/2;
             if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] > target) {
            end = mid - 1;
        } else if ( arr[mid] < target) {
            start = mid + 1;
        }
        }
        return -1;
       
    }
}
