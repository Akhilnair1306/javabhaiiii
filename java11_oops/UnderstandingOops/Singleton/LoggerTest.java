package java11_oops.UnderstandingOops.Singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            Logger samplelogger = Logger.establishLoggerConnection();
            Logger.log("Hello");
            System.out.println("Hashcode " + samplelogger.hashCode());
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");
        Thread t4 = new Thread(task, "Thread 4");
        Thread t5 = new Thread(task, "Thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
