package java11_oops.UnderstandingOops.Singleton;

public class Sample1 {
    
    private static Sample1 DbConnection;

    private Sample1() {
        System.out.println("DbConnection established successfully");
    }

    public static Sample1 estbalishConnection() {
        if(DbConnection == null) {
           DbConnection = new Sample1();
        } 
        return DbConnection;
    }
    
}
