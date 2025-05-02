package java1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Please enter a roll_no ");
        Scanner input = new Scanner(System.in);
        int roll_no = input.nextInt();
        System.out.println("the roll no entered by you is " + roll_no);
    }
}
