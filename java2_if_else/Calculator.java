package java2_if_else;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int ans = 0 ;
        while (true) {
            System.out.println("Enter the operand");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.println("Enter the integer");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if ( op == '+') {
                    ans = num1 + num2;
                } 
                if ( op == '-') {
                    ans = num1 - num2;
                }
                if ( op == '*') {
                    ans = num1 * num2;
                }
                if ( op == '/') {
                    if ( num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if ( op == '%') {
                    ans = num1 % num2;
                }
                System.out.println(ans);
            } else if ( op == 'x' || op == 'X') {
                System.out.println("Exiting the program");
                break;
            } else {
                System.out.println("Invalid operand");
            }
            
        }
    }
}
