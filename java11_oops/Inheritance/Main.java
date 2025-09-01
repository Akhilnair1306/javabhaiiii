package java11_oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight();
        System.out.println(box1.h + " " + box1.l + " " + box1.w + " " + box1.weight);
        BoxWeight box2 = new BoxWeight(5, 10);
        System.out.println(box2.h + " " + box2.l + " " + box2.w + " " + box2.weight);
        box2.information();
    }
}
