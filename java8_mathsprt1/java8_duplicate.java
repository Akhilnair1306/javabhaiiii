// package java8_mathsprt1;

//find non-duplicate element in an array
public class java8_duplicate {
    public static void main(String[] args) {
        int[] arr = {91,2,3,4,1,2,1,3,6,4,6};
        int sum = 0;
        for (int i = 0 ; i < arr.length; i++) {
             sum = sum ^ arr[i];
            //  System.out.println(sum);
        }
        System.out.println(sum);
    }
}
