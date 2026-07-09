class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Logger Created");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}

public class Exercise1 {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Hello");

        System.out.println(l1 == l2);
    }
}
