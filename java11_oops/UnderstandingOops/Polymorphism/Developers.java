package java11_oops.UnderstandingOops.Polymorphism;

public class Developers extends Employee{
    String name;
    public Developers(String name) {
        super(6);
        this.name = name;
    }

    @Override
    void calculatingSalary() {
        int salary = this.base_salary * (this.multiplier/2);
        System.out.println("Printing salary of " + name + " " + salary);
    }
}
