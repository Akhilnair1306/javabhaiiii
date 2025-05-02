package java1;

import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your tempearture in Celsius");
        float tempincel = in.nextInt();
        float tempinfah = (tempincel * 9/5) + 32;
        System.out.println("the tempinfah is " + tempinfah);
    }
}
