package java11_oops.UnderstandingOops.Polymorphism;

public class Calculator {

    int add( int digit1, int digit2) {
        System.out.println("In int add");
        return digit1 + digit2;
    }

    double add( double digit1, double digit2) {
        System.out.println("In double add");
        return digit1 + digit2;
    }

    float add( float digit1, float digit2) {
        System.out.println("In float add");
        return digit1 + digit2;
    }
}
