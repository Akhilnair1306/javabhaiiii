package java11_oops;

public class Beginning {
    public static void main(String[] args) {
        Student student1 = new Student(100, "Hey", 99.8f);
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
    }

    
}

class Student  {
        int rno;
        String name;
        float marks;

        // Student (int roll, String naam, float score) {
        //     rno =roll;
        //     name = naam;
        //     marks = score;
        // }
        Student (int rno, String name, float marks) {
            this.rno =rno;
            this.name = name;
            this.marks = marks;
        }
    }
