package java11_oops.UnderstandingOops.InheritanceAgain;

public class Car extends Vehicle{
    public Car() {
        super(4, "White", 4);
    }
    void startingCar() {
        System.out.println("Starting Car with " + this.wheels + " wheels " + this.color + " color " + this.seats + " seats ");
    }
}
