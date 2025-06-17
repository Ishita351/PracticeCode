package chapter5;

// use of "synchronized" keyword to ensure synchronization
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton uniqueInstance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ThreadSafeSingleton();
        }
        return uniqueInstance;
    }
}

//The method getInstance() is marked as synchronized, so only one thread can enter it at a time.
