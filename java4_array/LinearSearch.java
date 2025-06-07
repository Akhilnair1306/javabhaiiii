package java4_array;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i< size; i++) {
            System.out.println("Enter the number in the array");
            array[i] = input.nextInt();
        }
        System.out.println("Enter the number to search in the array");
        int target = input.nextInt();
        System.out.println(linsearch(array, target));
    }
    static int linsearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                return i;
            }
        } 
        return -1;
    }
}
