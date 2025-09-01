package java11_oops.UnderstandingOops.Polymorphism;

public class Employee {
    final int base_salary = 10000;
    int multiplier;
    public Employee( int multiplier) {
        // this.base_salary = 0;
        // this.base_salary = base_salary;
        this.multiplier = multiplier;
    }
    void calculatingSalary() {
        int salary = base_salary * multiplier;
        System.out.println("The salary of the designated employee is "+ salary);
    }
}
