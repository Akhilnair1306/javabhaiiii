// package java8_mathsprt1;

import java.util.Scanner;

//given a number state whether it is even or odd
public class java8_eveodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println((a&1) == 0 ? "even" : "odd");
    }
}
