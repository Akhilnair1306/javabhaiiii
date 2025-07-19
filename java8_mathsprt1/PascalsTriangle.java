import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the sum of the row you want to get in a Pascal's triangle");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 1 << (a-1);
        System.out.println(sum);
    }
}
