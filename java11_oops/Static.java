package java11_oops;
public class Static {
    // Instance variables
    String name;
    int age;

    // Constructor
    // Static(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Static s1 = new Static( );
        // Static s2 = new Static("Neha", 21);

        s1.show();  
        // s2.show(); 
    }
}

