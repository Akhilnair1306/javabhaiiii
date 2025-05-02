package java2_switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int num = in.nextInt();
           switch (num) {
            case 1 : 
            System.out.println("Mon");
            break;
            case 2 : 
            System.out.println("Tue");
            break;
            case 3 : 
            System.out.println("Wed");
            break;
            case 4 : 
            System.out.println("Thurs");
            break;
            case 5 : 
            System.out.println("Fri");
            break;
            default : 
            System.out.println("enter number from 1 to 5");
            break;
           }
    }
}
