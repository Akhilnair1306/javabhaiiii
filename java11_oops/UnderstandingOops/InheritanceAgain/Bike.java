package java11_oops.UnderstandingOops.InheritanceAgain;

public class Bike extends Vehicle{
    public Bike() {
        super(2, "Red", 2);
    }
    void startingBike() {
        System.out.println("Starting Bike with " + this.wheels + " wheels " + this.color + " color " + this.seats + " seats ");
    }
}
