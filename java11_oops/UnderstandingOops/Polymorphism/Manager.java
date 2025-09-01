package java11_oops.UnderstandingOops.Polymorphism;

public class Manager extends Employee{
    String name;
    public Manager(String name) {
        // super(base_salary, multiplier)
        super(5);
        this.name = name;
    }

    @Override
    void calculatingSalary() {
        int salary = this.base_salary * this.multiplier;
        System.out.println("Printing salary of " + name + " "+ salary);
    }
}
