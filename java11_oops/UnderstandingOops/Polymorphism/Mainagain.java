package java11_oops.UnderstandingOops.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Mainagain {
    public static void main(String[] args) {
        Manager Vivek = new Manager("Vivek");
        Developers Shyamu = new Developers("Shyamu");
        List<Employee> employees= new ArrayList<>();
        employees.add(Vivek);
        employees.add(Shyamu);

        for(Employee e: employees) {
            e.calculatingSalary();
        }
    }
}
