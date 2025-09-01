package java11_oops.UnderstandingOops.Singleton;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Initializing the Logger");
    }

    public static synchronized Logger establishLoggerConnection() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void log(String message) {
        System.out.println(Thread.currentThread().getName() + " ---> " + message);
    }
}
