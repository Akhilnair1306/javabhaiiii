package java11_oops.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = 100;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
