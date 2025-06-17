package java5_sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        BubbleSorting(array);
    }
    static void BubbleSorting(int[] array) {
        int temp = 0;
        for(int i = 0; i <= array.length - 1; i++) {
            for (int j = 1; j <= array.length - 1 - i; j++) {
                if(array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is ");
        for ( int i = 0 ; i <= array.length - 1; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
