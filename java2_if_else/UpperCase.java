package java2_if_else;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letter = in.next().trim().charAt(0);
        if ( letter >= 'a' && letter <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
