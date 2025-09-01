package java11_oops.UnderstandingOops.Singleton;

public class Main {
    public static void main(String[] args) {
        Sample1 DbConnection1 = Sample1.estbalishConnection();
        Sample1 DbConnection2 = Sample1.estbalishConnection();
        Sample1 DbConnection3 = Sample1.estbalishConnection();

        System.out.println("DbConnection1 " + DbConnection1.hashCode());
        System.out.println("DbConnection2 " + DbConnection2.hashCode());
        System.out.println("DbConnection3 " + DbConnection3.hashCode());

    }
}
